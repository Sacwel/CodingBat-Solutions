package BasicRecursion;

/**
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively.
 * No loops, no multiplication.
 *
 * bunnyEars(0) → 0
 * bunnyEars(1) → 2
 * bunnyEars(2) → 4
 */

public class BunnyEarsOne {

  public static int countEars(int bunnies) {
    // Base case:
    if (bunnies == 0) { //if bunnies == 0,
      return 0; // just return 0.
    }

    // Recursive case: otherwise, make a recursive call with bunnies-1
    return 2 + countEars(bunnies - 1);
  }

  public static void main(String[] args) {

    System.out.println(countEars(0));
    System.out.println(countEars(1));
    System.out.println(countEars(3));

  }
}
