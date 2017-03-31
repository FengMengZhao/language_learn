#!/usr/bin/python

a = 42

def foo():
    #global a
    a = 13

foo()
print a

i = 0

def foo2():
    #i = 1
    global i
    i = i + 1
    print(i)

foo2()
