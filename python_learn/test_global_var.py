#!/usr/bin/python 
count = 6

def func1():
    count = 100 #local variable

def func3():
    global count
    count = 100

def func2():
    if(7 == count + 1):
        print count

array = [1]

def func4():
    array.append(2)
    #array = array.append[2]
    print array

#func1()
#func3()
#print count
#func2()
#func4()

def func5():
    global name
    name = "fengmengzhao"
    print name

def func6():
    global name
    name = "cll"

func6()
func5()
