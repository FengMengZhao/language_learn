# -*- coding: UTF-8 -*-
import pandas as pd
import numpy as np
import random

if __name__ == '__main__':
	fname = "C:/Users/fmz/workspace/data/spam/spambase.data"
	dataframe = pd.read_csv(fname, header=None)
	#print dataframe.head()

	train_array = np.array([])
	test_array = np.array([])

	#column_num = dataframe.shape[1]
	column_num = len(dataframe.columns)
	index_num = dataframe.shape[0]
	#index_num = len(dataframe.index)
	#print column_num
	#print index_num

	y = dataframe.iloc[:, column_num-1].values
	#print y
	pred_label_list = np.unique(y)
	#print pred_label_list

	train_pct = 0.8
	for pred_label in pred_label_list:
		item_index = np.where(y==pred_label)[0]
		print 'item_index for ' + str(pred_label)
		print item_index
		print

		train_sample_size=int(len(item_index)*train_pct)	
		print 'train_sample_size: '
		print train_sample_size
		print 

		item_index_train = random.sample(item_index.tolist(), train_sample_size)
		print 'item_index_train: '
		print item_index_train
		print 

		item_index_test = list(set(item_index) - set(item_index_train))
		print 'item_index_test: '
		print item_index_test
		print

		if train_array.size == 0:
			train_array = dataframe.iloc[item_index_train, :]
		else:
			train_array = np.vstack((train_array, dataframe.iloc[item_index_train, :]))

		if test_array.size == 0:
			test_array = dataframe.iloc[item_index_test, :]
		else:
			test_array = np.vstack((test_array, dataframe.iloc[item_index_test, :]))
