#!/usr/bin/python

def foo(x, items = []):
    items.append(x)
    return items

print foo(1)
print foo(2)
print foo(3)

def foo2(x, items = None):
    if(items is None):
        items = []
    items.append(x)
    return items

print foo2(1)
print foo2(2)
print foo2(3)

a = [1, 2, 3, 4, 5]

def square(items):
    for i,x in enumerate(items):
        items[i] = x * x

square(a)

print a
