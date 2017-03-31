#!/usr/bin/python 

def callf(func):
    return func

def helloworld():
    print 'Hello, world!'

#print 'Hello, world!'

print callf(helloworld)
