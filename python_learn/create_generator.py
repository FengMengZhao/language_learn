#!/usr/bin python

def countdown(n):
    print "Counting down!"
    while n > 0:
        yield n
        n -= 1

c = countdown(9)

#print c.next()

for i in countdown(5):
    print i
