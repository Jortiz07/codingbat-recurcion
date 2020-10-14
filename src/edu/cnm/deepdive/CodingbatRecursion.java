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

  public int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }

  public int bunnyEars2(int bunnies) {

    if (bunnies == 0) {
      return bunnies;
    }
    if (bunnies % 2 == 0) {
      return 3 + bunnyEars2(bunnies-1);
    }
    return 2 + bunnyEars2(bunnies -1);
  }



}
