#!/usr/bin/env python
# Ryan Gliever
# FizzBuzz in Python

for i in range(1, 101):
  msg = ''
  if i%3 == 0:
    msg += 'Fizz'
  if i%5 == 0:
    msg += 'Buzz'
  elif i%3 != 0 and i%5 != 0:
    msg = i
  print msg
