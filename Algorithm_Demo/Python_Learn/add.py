def add(x, y=4, z=12):
	return x+y+z

a=10
def foo(x=a):
	return x

def foo2(x, items=[]):
	items.append(x)
	return items

def foo3(x, items=None):
	if items is None:
		items=[]
	items.append(x)
	return items

def fprintf(file, fmt, *args):
	file.write(fmt % args)

if __name__ == '__main__':
	#print add(5, 3)
	#a=5
	#print foo()
	#print foo3(1)
	#print foo3(2)
	#print foo3(3)
	fprintf(open("G:\Algorithm_Demo\python_learn\out", "w"), "%d %s %f", 42, "hello,world", 3.45)
