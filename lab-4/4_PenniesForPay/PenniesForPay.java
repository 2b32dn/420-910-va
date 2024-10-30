import java.util.Scanner;

public class PenniesForPay {
  public static void main(String[] args) {
    double salary = 0.01;
    double totalSalary = 0.01;
    int day = 1, days;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter number of days: ");
    days = keyboard.nextInt();
    keyboard.nextLine();

    while (days < 1) {
      System.out.println("Enter number of days: ");
      days = keyboard.nextInt();
      keyboard.nextLine();
    }

    System.out.printf("Number of days entered: %d \n", days);
    System.out.println("Salary   Day  Total ");

    while (days > 0) {
      System.out.printf("$%,.2f    %d    $%,.2f \n", salary, day, totalSalary);
      salary = 0.01 * Math.pow(2, day);
      totalSalary += salary;
      day++;
      days--;
    }
    keyboard.close();
  }
}