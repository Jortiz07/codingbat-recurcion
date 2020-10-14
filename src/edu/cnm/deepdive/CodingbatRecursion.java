package edu.cnm.deepdive;

public class CodingbatRecursion {
  public int factorial(int n) {
    if (n == 1) return n;
    return n * factorial(n-1);
  }

  public int bunnyEars(int bunnies) {
    if (bunnies == 0) {
     return bunnies;
    }
    return 2 + bunnyEars(bunnies - 1);
  }


}
