// Ryan Gliever
// FizzBuzz in C

#include <stdio.h>
#include <stdlib.h>

int main () {
  for (int i=1; i<=100; i++) {
    if (i%3==0) { printf("Fizz"); }
    if (i%5==0) { printf("Buzz"); }
    else if(i%3!=0 && i%5!=0) { printf("%d", i); }
    printf("\n");
  }
}
