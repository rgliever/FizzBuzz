GCC	= gcc -g -O0 -Wall -std=gnu99
FB	= fizzbuzz.c

all : fizzbuzz

fizzbuzz : fizzbuzz.o
	${GCC} -o $@ fizzbuzz.o

fizzbuzz.o : ${FB}
	${GCC} -c ${FB}
