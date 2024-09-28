import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    String name;
    int hours;
    double payRate;
    double grossPay;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What's your name? ");
    name = keyboard.nextLine();

    System.out.print("How many hours did you work? ");
    hours = keyboard.nextInt();

    System.out.print("how much do you get paid per hour? ");
    payRate = keyboard.nextDouble();

    System.out.println(name + "'s gross pay is " + hours * payRate + "$");
  }
} 