package BasicRecursion;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 * count7(717) → 2
 * count7(7) → 1
 * count7(123) → 0
 */

public class CountSeven {

  public static int count7(int n) {
    // Base Case:
    if (n < 7) { //if the number is less than 7, obviously it doesn't have any 7's in it
      return 0; // So, return 0 and exit recursive step
    }

    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    } else {
      return count7(n / 10);
    }
  }

  public static void main(String[] args) {

    System.out.println(count7(717));
    System.out.println(count7(7));
    System.out.println(count7(123));
    System.out.println(count7(770700));

  }
}
