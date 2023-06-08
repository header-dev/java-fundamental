/**
 * TestFor
 */
public class TestFor {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      if (i != 4) {
        System.out.println(i);
      } else
        break;
    }
    System.out.println("End Loop");
  }
}