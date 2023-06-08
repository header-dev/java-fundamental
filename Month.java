import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
  public static void main(String[] args) {
    String month[] = {
        "January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December",
    };

    String s;
    int index;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);
    System.out.print("Enter month number (1-12 only) : ");
    try {
      s = in.readLine();
      index = Integer.parseInt(s);
      if (index < 1 || index > 12) {
        System.out.println("Month number error");
      } else {
        System.out.println(index + " = " + month[index - 1]);
      }
    } catch (IOException e) {
      System.out.println("Read Input keyboard error");
    }
  }
}
