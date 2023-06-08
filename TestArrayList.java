import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    ArrayList<Character> arrList = new ArrayList<Character>(5);
    arrList.add('a');
    arrList.add('r');
    arrList.add('e');
    System.out.print("Before : ");
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i));
    }
    System.out.println();
    arrList.add(0, 's');
    arrList.add(1, 'h');
    System.out.print("After : ");
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i));
    }
    System.out.println();
    arrList.set(2, 'i');
    arrList.set(3, 'n');
    arrList.set(4, 'e');
    System.out.print("Afterward : ");
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i));
    }
  }
}
