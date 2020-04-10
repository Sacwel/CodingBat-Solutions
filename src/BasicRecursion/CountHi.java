package BasicRecursion;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 *
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */

public class CountHi {

  public static int counter(String str) {
    if (str.length() < 2) {
      return 0;
    }

    int count = 0;
    if(str.substring(0, 2).equals("hi")) {
      count = 1;
    }
    return count + counter(str.substring(1));
  }

  public static void main(String[] args) {

    System.out.println(counter("xxhixx"));
    System.out.println(counter("xhixhix"));
    System.out.println(counter("hi"));
    System.out.println(counter("hixxHIxhi"));

  }

}
