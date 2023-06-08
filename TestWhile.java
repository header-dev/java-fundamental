public class TestWhile {
  public static void main(String[] args) {
    int counter = 20;
    while ((counter -= 5) != 0) {
      System.out.println("counter = " + counter + "\tThis is in while loop");
    }
    System.out.println("counter = " + counter + "\tThis is out of while loop");
  }
}
