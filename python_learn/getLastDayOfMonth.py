#!/usr/bin/python

import datetime

def getLastDayOfMonth(any_day):
     next_month = any_day.replace(day=28) + datetime.timedelta(days=4)  # this will never fail
     return next_month - datetime.timedelta(days=next_month.day)

print getLastDayOfMonth(datetime.date(2017, 2, 11))
