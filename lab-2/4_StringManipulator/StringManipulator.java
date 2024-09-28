import java.util.Scanner;

public class StringManipulator {
  public static void main(String[] args) {

    String city;
    Scanner userInput = new Scanner(System.in);
    

    System.out.println("What's your favorite city?");
    city = userInput.nextLine();

    System.out.println("The number of characters in the " + city + " name is " + city.length());
    System.out.println("The city's name in all uppercase letters " + city + " is " + city.toUpperCase());
    System.out.println("The city's name in all lowercase letters " + city + " is " + city.toLowerCase());
    System.out.println("The first character in the name of " + city + " is " + city.charAt(0));
    
    userInput.close();
  }
}