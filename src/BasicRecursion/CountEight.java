package BasicRecursion;

/**
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit.
 * Except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 */

public class CountEight {

  public static int count8(int n) {
    // Base Case:
    if (n < 7) { //if the number is less than 7, obviously it doesn't have any 7's in it
      return 0; // So, return 0 and exit recursive step
    }

    if (n % 10 == 8) { // if the digit is an 8
      if (n / 10 % 10 == 8) { // if the digit and the one next to it is an 8
        return 2 + count8(n / 10); // either return double the count
      }
      return 1 + count8(n / 10); // or return just the single entity digit
    } else {
      return count8(n / 10); // otherwise, if the digit isn't an 8, just go to the next digit
    }
  }

  public static void main(String[] args) {

    System.out.println(count8(8));
    System.out.println(count8(818));
    System.out.println(count8(808));
    System.out.println(count8(8818));
    System.out.println(count8(8188));
    System.out.println(count8(888));

  }
}
