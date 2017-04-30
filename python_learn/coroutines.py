#!/usr/bin python

def print_matches(matchtext):
    print "Looking for", matchtext
    while True:
        line = (yield)
        if matchtext in line:
            print line

matcher = print_matches("python")
matcher.next()

matcher.send("Hello, world!")
matcher.send("python is cool!")
matcher.send("cool!")
matcher.send("I love python!")
matcher.close()
