package BasicRecursion;

/**
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 *
 * bunnyEars2(0) → 0
 * bunnyEars2(1) → 2
 * bunnyEars2(2) → 5
 */

public class BunnyEarsTwo {

  public static int countEars(int bunnies) {
    // Base case:
    if (bunnies == 0) { //if bunnies == 0,
      return 0; // just return 0.
    }

    // Recursive case: otherwise, make a recursive call with bunnies-1
    // Returning 3 ears and 2 ears for even and odd number bunnies respectively
    if (bunnies % 2 == 0) {
      return 3 + countEars(bunnies-1);
    } else {
      return 2 + countEars(bunnies-1);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(countEars(i));
    }
  }

}
