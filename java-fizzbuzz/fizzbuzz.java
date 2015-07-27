// Ryan Gliever
// FizzBuzz in Java

import java.io.*;
import static java.lang.System.*;

class fizzbuzz {
  public static void main (String[] args) {
    for (int i=1; i<=100; i++){
      if ((i%3)==0) { out.printf ("Fizz"); }
      if ((i%5)==0) { out.printf ("Buzz"); }
      else if (((i%3)!=0) && ((i%5)!=0)) { out.printf ("%d", i); }
      out.printf("%n");
    }
  }
}
