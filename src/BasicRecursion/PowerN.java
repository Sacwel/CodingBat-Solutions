package BasicRecursion;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
 *
 * powerN(3, 1) → 3
 * powerN(3, 2) → 9
 * powerN(3, 3) → 27
 */

public class PowerN {

  public static int powerOfN(int base, int n) {
    // Base case:
    if (n <= 1) { // if the n'th power is 1 or less, return the value of base
      return base;
    } else {
      return base * powerOfN(base, n -1); // otherwise, just do the math
    }
  }

  public static void main(String[] args) {

    System.out.println(powerOfN(3, 1));
    System.out.println(powerOfN(3, 2));
    System.out.println(powerOfN(3, 3));
    System.out.println(powerOfN(3, 4));
    System.out.println(powerOfN(3, 5));

  }
}
