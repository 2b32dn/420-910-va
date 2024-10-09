import java.util.Scanner;

public class GradingSystem {
  public static void main(String[] args) {
    
    int grade1 ,grade2, grade3, average;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter 3 different grade between 0-100");
    System.out.print("Insert the first grade: ");
    grade1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("Insert the second grade: ");
    grade2 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("Insert the third grade: ");
    grade3 = keyboard.nextInt();
    keyboard.nextLine();

    average = (grade1 + grade2 + grade3 ) / 3;

    System.out.println("The average score is " + average);
    
    if (average >= 90 && average <= 100) {
      System.out.println("Your grade is: A");
    } else if (average >= 80 && average <= 89) {
      System.out.println("Your grade is: B");
    } else if (average >= 70 && average <= 79) {
      System.out.println("Your grade is: C");
    } else if (average >= 60 && average <= 69) {
      System.out.println("Your grade is: D");
    } else if (average <= 60) {
      System.out.println("Your grade is: F");
    } else {
      System.out.println("Your grade is beyond any comprehension");
    }
  }
}