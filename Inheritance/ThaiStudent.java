package Inheritance;

public class ThaiStudent extends People {

  double grade;

  public ThaiStudent() {
    grade = 3.06;

    age = 6;
  }

  public void printData() {
    System.out.println("Age : " + age);
    System.out.println("Grade : " + grade);
  }

  public static void main(String[] args) {
    ThaiStudent s = new ThaiStudent();
    s.setName("Witz");
    System.out.println("Name : " + s.getName());
    s.printData();
  }

}
