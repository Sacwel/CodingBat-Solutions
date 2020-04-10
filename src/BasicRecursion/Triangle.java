package BasicRecursion;

/**
 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
 * Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
 *
 * triangle(0) → 0
 * triangle(1) → 0 + 1 = 1
 * triangle(2) → 1 + 2 = 3
 * triangle(3) → 3 + 3 = 6
 * triangle(4) → 6 + 4 = 10
 * triangle(5) → 10 + 5 = 15
 *
 *           -> 0
 *          * -> 1
 *         * * -> 2
 *        * * * -> 3
 *       * * * * -> 4
 *      * * * * * -> 5
 *
 * Row 3 has 3 blocks, row 5 has 5 blocks, row 7 has 7 blocks and so on
 * Sooo, what is triangle(20)?  →  It's whatever triangle(19) returns, plus 20.
 */

public class Triangle {
  public static int triBlox(int rows) {
    // Base case:
    if (rows <= 1) { // if there is 1 or less rows, just return the number of blocks in that row
      return rows;
    }
    // Recursive step: adding number of rows to the number of blocks
    return rows + triBlox(rows - 1);

  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(triBlox(i));
    }
  }
}
