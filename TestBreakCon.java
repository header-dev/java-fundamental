/**
 * TestBreakCon
 */
public class TestBreakCon {
  public static void main(String[] args) {
    int i;
    for (i = 0; i <= 10; i++) {
      if (i == 3) {
        // Jump back to Line 7 loop again;
        continue;
      }
      System.out.println("This is round" + i);
      if (i == 5)
        break;
    }
    System.out.println("Loop run " + i + " rounds");
  }
}