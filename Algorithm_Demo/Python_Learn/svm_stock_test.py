# -*- coding: UTF-8 -*-

import numpy as np
import pandas as pd
from matplotlib.pylab import *
import matplotlib.pyplot as plt
import random
from sklearn import svm
import sys

def generate_train_test(dataframe, train_pct):
	train_array = np.array([])
	test_array = np.array([])

	column_num = len(dataframe.columns)

	y = dataframe.iloc[:, column_num-1].values
	pred_label_list = np.unique(y)

	for pred_label in pred_label_list:
		# 对应列值的行号，生成数组
		item_index = np.where(y == pred_label)[0]

		# 取得训练样本的大小(整数)
		train_sample_size = int(len(item_index)*train_pct)

		# 获取并且打乱训练样本数目的样本行号
		item_index_train = random.sample(item_index.tolist(), train_sample_size)

		# 用总行号list减去用来训练的行号list，得到用来测试的行号list
		item_index_test = list(set(item_index) - set(item_index_train))

		if train_array.size == 0:
			train_array = dataframe.iloc[item_index_train, :]
		else:
			train_array = np.vstack((train_array, dataframe.iloc[item_index_train, :]))

		if(test_array.size == 0):
			test_array = dataframe.iloc[item_index_test, :]
		else:
			test_array = np.vstack((test_array, dataframe.iloc[item_index_test, :]))

	return (pd.DataFrame(train_array), pd.DataFrame(test_array))


def plot_array(array, xlable, ylabel):
	boxplot(array)

	plt.xlabel(xlable)
	plt.ylabel(ylabel)
	plt.ylim(np.min(array), np.max(array))

	plt.show()

def train_pred_svm_misclass(train_dataframe, test_dataframe, c_val):
	x_train = train_dataframe.iloc[:, 0:train_dataframe.shape[1]-1]
	y_train = train_dataframe.iloc[:, train_dataframe.shape[1]-1]

	x_test = test_dataframe.iloc[:, 0:test_dataframe.shape[1]-1]
	y_test = test_dataframe.iloc[:, test_dataframe.shape[1]-1]

	# svm 不输出概率

	#构建模型
	#clf = svm.SVC(C=c_val, kernel='linear', gamma='auto')
	clf = svm.SVC(C=c_val, kernel='rbf', gamma=0.1)
	# 训练数据
	clf.fit(x_train, y_train)

	y_test_pred = clf.predict(x_test)

	return sum(y_test_pred != y_test) / float(y_test.shape[0])

if __name__ == '__main__':

	fname = "G:/Algorithm_Demo/Python_Learn/stock.xlsx"
	dataframe = pd.read_excel(fname, 'stock_1', skiprows=1, header=None, )
	print dataframe

	# 统计数据的基本信息(个数、均值、方差、最大数、最小数...)
	summary = dataframe.describe()
	print summary

	# 画出原始统计图形
	array = dataframe.values

	#plot_array(array, 'Attribute Index', 'Quantile Ranges')

	# 高斯归一化处理
	gauss_dataframe = dataframe.copy()	

	for i in range(gauss_dataframe.shape[1]-1):
		mean = summary.iloc[:, i].values[1]
		sd = summary.iloc[:, i].values[2]

		gauss_dataframe.iloc[:, i] = (dataframe.iloc[:, i] - mean) / sd

	print gauss_dataframe

	# 画出归一化后统计模型
	array = gauss_dataframe.values

	#plot_array(array, 'Attribute Index', 'Quantile Ranges')

	# 训练集测试集的切分
	train_pct = 0.8
	(train_dataframe, test_dataframe) = generate_train_test(gauss_dataframe, train_pct)
	#print train_dataframe
	#print test_dataframe

	#c_vals = [0.01, 0.1, 1, 10, 20, 50, 100]
	c_vals= [50]
	for c_val in c_vals:
		print 'misclass ratio(svm,  C=', c_val, ', rbf kernel)', train_pred_svm_misclass(train_dataframe, test_dataframe, c_val)