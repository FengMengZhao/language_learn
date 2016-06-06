import matplotlib.pyplot as plt
import numpy as np

if __name__ == '__main__':
	
	delta = 0.002
	x = np.arange(-3, 3, delta)
	y = np.arange(-3, 3, delta)
	X, Y = np.meshgrid(x, y)
	print X
	print Y

	Z = X**2 + Y**2

	plt.contour(X, Y, Z)
	plt.show()