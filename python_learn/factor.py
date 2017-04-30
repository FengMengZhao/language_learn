#!/usr/bin/python

def factor(a):
    d = 2
    while(d <= (a / 2)):
        if(a / d) * d == a:
            return ((a / d), d)
        d = d + 1
    return (a, 1)

print factor(4)
print factor(5)
print factor(6)
print factor(7)
print factor(10)
print factor(24)
