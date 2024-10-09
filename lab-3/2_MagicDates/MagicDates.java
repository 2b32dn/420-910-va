import java.util.Scanner;

public class MagicDates {
  public static void main (String[] args) {

    int month, day, year, total;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a month in its numerical factor: ");
    month = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter a day (1-31): ");
    day = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter a two digit year: ");
    year = keyboard.nextInt();
    keyboard.nextLine();

    total = month * day;

    if (total == year) {
      System.out.println("It's magic date!");
    } else {
      System.out.println("It's not a magic date");
    }

  }
}