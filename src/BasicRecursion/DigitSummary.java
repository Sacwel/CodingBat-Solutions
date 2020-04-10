package BasicRecursion;

/**
 * Given a non-negative int n, return the sum of its digits recursively (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * and that divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 */

public class DigitSummary {

  public static int sumDigits(int n) {
    // Base case: the sum of a single digit int is the int itself so
    if (n < 10) { // if the given number is less than 10
      return n; // Just return the number itself
    }

    return (n % 10 + sumDigits(n / 10));
  }

  public static void main(String[] args) {
    System.out.println(sumDigits(126));
    System.out.println(sumDigits(49));
    System.out.println(sumDigits(12));
  }
}
