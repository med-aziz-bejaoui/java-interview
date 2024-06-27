package basic;

import io.vavr.control.Option;

public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * also return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    // Check for invalid input
    if (i == null || n == null || n < 0) {
      return Option.none();
    }

    try {
      int result = 1;
      for (int j = 0; j < n; j++) {
        result *= i;
        // Check for overflow
        if (result < 0) {
          return Option.none();
        }
      }
      return Option.some(result);
    } catch (Exception e) {
      // In case of any error, return None
      return Option.none();
    }
  }
}
