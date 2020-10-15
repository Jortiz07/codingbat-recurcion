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

  public int triangle(int rows) {
    if (rows == 0) {
      return rows;
    }
    return rows + triangle(rows-1);
  }

  public int sumDigits(int n) {
    if (n >= 10) {
      return n % 10 + sumDigits(n/10);
    }
    return n;
  }

  public int count7(int n) {
    if (n % 10 == 7) {
      return 1 + count7(n/10);
    }
    if (n >= 10) {
      return count7(n/10);
    }

    return 0;
  }

  public int count8(int n) {
    if (n % 10 == 8 && (n/10) % 10 == 8) {
      return 2 + count8(n/10);
    } else if (n % 10 == 8) {
      return 1 + count8(n/10);
    } else if (n >= 10) {
      return count8(n/10);
    } else
      return 0;
  }

  public int powerN(int base, int n) {
    if (n > 0) {
      return base * powerN(base, n-1);
    }
    return 1;
  }





}
