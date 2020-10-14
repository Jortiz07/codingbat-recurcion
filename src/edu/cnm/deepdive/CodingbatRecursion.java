package edu.cnm.deepdive;

public class CodingbatRecursion {
  public int factorial(int n) {
    if (n == 1) return n;
    return n * factorial(n-1);
  }


}
