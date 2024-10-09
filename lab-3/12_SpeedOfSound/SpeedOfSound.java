import java.util.Scanner;

public class SpeedOfSound {
  public static void main (String[] args) {

    int distance, time;
    String medium;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter either air, water or steel: ");
    medium = keyboard.nextLine().toLowerCase();

    System.out.print("Enter a distance in feet: ");
    distance = keyboard.nextInt();
    keyboard.nextLine();

    switch(medium) {
      case "air":
        time = distance / 1100;
        System.out.printf("It take %d seconds", time);
        break;
      case "water":
        time = distance / 4900;
        System.out.printf("It take %d seconds", time);
        break;
      case "steel":
        time = distance / 16400;
        System.out.printf("It take %d seconds", time);
        break;
      default:
        System.out.print("Run the program again with the correct input");
        break;
    }

  }
}