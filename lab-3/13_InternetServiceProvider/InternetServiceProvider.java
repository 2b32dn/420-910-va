import java.util.Scanner;

public class InternetServiceProvider {
  public static void main (String[] args) {

    double hours, remainder, total;
    String selection;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Select a package between a, b and c: ");
    selection = keyboard.nextLine().toLowerCase();

    System.out.print("Enter the number of hours: ");
    hours = keyboard.nextDouble();
    keyboard.nextLine();

    switch(selection) {
      case "a":

        if(hours <= 10) {
          System.out.println("Your monthly bill is: $9.95");
        } else {
          total = (hours - 10) * 2 + 9.95;
          System.out.printf("\n Your monthly bill is: %.2f$" ,total);
        }

        break;
      case "b":
  
        if(hours <= 20) {
          System.out.println("Your monthly bill is: $13.95");
        } else {
          total = (hours - 10) * 2 + 13.95;
          System.out.printf("\n Your monthly bill is: %.2f$" ,total);
        }
        
        break;
      case "c":

        
        System.out.printf("Your monthly bill is $19.95.");

        break;
      default:
        System.out.print("Run the program again with the correct input");
        break;
    }
  }
}