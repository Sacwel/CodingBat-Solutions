package BasicRecursion;

/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 *
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */

public class CountX {

  public static int counter(String str) {
    if (str.length() == 0) {
      return 0;
    }

    int count = 0;
    if(str.substring(0, 1).equals("x")) {
      count = 1;
    }

    return count + counter(str.substring(1));
  }

  public static void main(String[] args) {

    System.out.println(counter("xxhixx"));
    System.out.println(counter("xhixhix"));
    System.out.println(counter("hi"));

  }

}
