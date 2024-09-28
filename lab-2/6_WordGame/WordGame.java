import java.util.Scanner;

public class WordGame {
  public static void main(String[] args) {

    String name;
    int age;
    String city;
    String college;
    String job;
    String animalType;
    String nameOfPet;
    
    // Initializing Scanner Object
    Scanner input = new Scanner(System.in);

    System.out.println("Hi User, let's play a word game.");
    System.out.println("First, tell me your name?");
    name = input.nextLine();

    // Capitalize name
    String nameCapitalize = name.substring(0, 1).toUpperCase() + name.substring(1);
    
    System.out.println("What is your age?");
    age = input.nextInt();
    input.nextLine(); // To create a new line and prevent the next input from any input error because nextInt only accepts int.

    System.out.println("Where do you live?");
    city = input.nextLine();

    // Capitalize City name
    String cityNameCapitalize = city.substring(0, 1).toUpperCase() + city.substring(1);

    System.out.println("Which college did you graduated from?");
    college = input.nextLine();

    System.out.println("What is your profession?");
    job = input.nextLine(); 

    System.out.println("What is your favorite animal?");
    animalType = input.nextLine();

    System.out.println("What is your pet's name?");
    nameOfPet = input.nextLine();

    // Capitalize Pet name
    String petNameCapitalize = nameOfPet.substring(0, 1).toUpperCase() + nameOfPet.substring(1);

    System.out.println("There once was a person named " + nameCapitalize + " who lived in " + cityNameCapitalize + ". At the age of " + age + ", "
     + nameCapitalize + " went to college at " + college + ". " + nameCapitalize + " graduated and went to work as a " + job + ". " + "Then, " 
     + nameCapitalize + " adopted a(n) " + animalType.toLowerCase() + " named " + petNameCapitalize + ". They both lived happily ever after!" 
    );

    input.close();
  }
}