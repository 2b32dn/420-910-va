import java.util.Scanner;

public class Population {
  public static void main(String[] args) {

    double organism, days, percentage;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a number of an organism: ");
    organism = keyboard.nextDouble();
    keyboard.nextLine();

    while (organism < 2) {
      System.out.println("Enter a number of an organism: ");
      organism = keyboard.nextDouble();
      keyboard.nextLine();
    }

    System.out.println("Enter a number of days: ");
    days = keyboard.nextDouble();
    keyboard.nextLine();

    while (days < 1) {
      System.out.println("Enter a number of days: ");
      days = keyboard.nextDouble();
      keyboard.nextLine();
    }

    System.out.println("Enter a percentage: ");
    percentage = keyboard.nextDouble();
    keyboard.nextLine();

    while (percentage < 0) {
      System.out.println("Enter a percentage: ");
      percentage = keyboard.nextDouble();
      keyboard.nextLine();
    }

    System.out.printf("Day     Population    Percentage \n");
    System.out.printf("--------------------------------\n");
    for (int day = 1; day <= days; day++) {
      if (day == 1) {
        System.out.printf("%d         %.2f            \n", day, organism);
      } else {
        organism = organism + (organism * (percentage / 100));
        System.out.printf("%d         %.2f           %.2f%% \n", day, organism, percentage);
      }
    }

    keyboard.close();
  }
}