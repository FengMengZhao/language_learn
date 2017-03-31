#!/usr/bin python

f = open("open_file.py")
line = f.readline()
while line: 
    print line, #trailing ',' omits newline character
#    print(line, end='') #use in Python 3
    line = f.readline()

for line in open("open_file.py"):
    print line,
f.close()
