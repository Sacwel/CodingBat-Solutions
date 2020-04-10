package BasicRecursion;

/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 * The factorial of a negative number doesn't exist. And the factorial of 0 is 1.
 * N! where n = 5 is: 5*4*3*2*1
 *
 * factorial(1) → 1
 * factorial(2) → 2
 * factorial(3) → 6
 */

public class Factorial {

  public static int factor(int n) {
    if(n == 0) { // or if n == 1 - it works either way
      return 1; // because 0! and 1! is = 1
    } else {
      return (n*factor(n-1));
    }
  }

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println(factor(i));
    }

  }
}
