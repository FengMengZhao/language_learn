# -*- encoding: UTF-8 -*-

import numpy as np
import matplotlib.pyplot as plt
from sklearn import svm, datasets

iris = datasets.load_iris()
X = iris.data[:, :2]
y = iris.target

#clf = svm.SVC(kernel='linear', C=1.0, gamma='auto')
clf = svm.SVC(kernel='rbf', C=10, gamma=10)

clf.fit(X, y)

x_min, x_max = X[:, 0].min()-1, X[:, 0].max()+1
y_min, y_max = X[:, 1].min()-1, X[:, 1].max()+1

print x_min, x_max, y_min, y_max

xx, yy = np.meshgrid(np.arange(x_min, x_max), np.arange(y_min, y_max))
print xx
print yy

plt.subplot(1, 1, 1)
Z = clf.predict(np.c_[xx.ravel(), yy.ravel()])
Z = Z.reshape(xx.shape)
print Z
plt.contourf(xx, yy, Z, cmap=plt.cm.Paired, alpha=0.8)

plt.scatter(X[:, 0], X[:, 1], c=y, cmap=plt.cm.Paired)
plt.xlabel('Sepal length')
plt.ylabel('Sepal width')
plt.xlim(xx.min(), xx.max())
plt.title('SVC width linear kernel')

plt.show()

