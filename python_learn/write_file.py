#!/usr/bin python

principal = 1000
rate = 0.05
numberyears = 15
year = 1

f = open("out", "w")
while year <= numberyears:
    principal = principal * (1 + rate)
    print >> f, "%0.3f" % principal
    year += 1
f.close()
