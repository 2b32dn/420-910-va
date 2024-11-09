import java.util.Scanner;

public class ConversionProgram {
  public static void main(String[] args) {
    double meters;
    int choice;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a distance in meters: ");
    meters = keyboard.nextDouble();
    System.out.print("1. Convert to kilometers \n2. Convert to inches \n3. Convert to feet \n4. Quit the program \n");

    do {
      System.out.println("Enter your choice: ");
      choice = keyboard.nextInt();
      keyboard.nextLine();

      switch (choice) {
        case 1:
          double kilometers = showKilometers(meters);
          System.out.printf("%.2f Km\n", kilometers);
          break;
        case 2:
          double inches = showInches(meters);
          System.out.printf("%.2f inches\n", inches);
          break;
        case 3:
          double feet = showFeet(meters);
          System.out.printf("%.2f ft\n", feet);
          break;
      }
    } while (choice != 4);

    keyboard.close();
  }

  public static double showKilometers(double meters) {
    double kilometers = meters * 0.001;
    return kilometers;
  }

  public static double showInches(double meters) {
    double inches = meters * 39.37;
    return inches;
  }

  public static double showFeet(double meters) {
    double feet = meters * 3.281;
    return feet;
  }
}