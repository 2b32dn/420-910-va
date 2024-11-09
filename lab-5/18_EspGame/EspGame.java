import java.util.Scanner;
import java.util.Random;

public class EspGame {
  public static void main(String[] args) {

    boolean guess;
    String computerChoice, playerChoice;
    int count = 1, correctGuess = 0;
    Scanner keyboard = new Scanner(System.in);
    String[] list = {
        "Red",
        "Orange",
        "Yellow",
        "Green",
        "Blue"
    };

    do {
      System.out.print("Enter either Red, Orange, Yellow, Green or Blue: ");
      Random random = new Random();
      int randomizer = random.nextInt(5);
      computerChoice = list[randomizer];

      playerChoice = keyboard.nextLine();

      colorComparison(computerChoice, playerChoice);
      guess = playerChoice.equalsIgnoreCase(computerChoice);

      if (guess) {
        correctGuess += 1;
      }
      count++;
    } while (count <= 10);
    System.out.printf("Out of 10 guesses, you guessed %d correctly!", correctGuess);
    keyboard.close();
  }

  public static void colorComparison(String computerChoice, String playerChoice) {
    if (playerChoice.equalsIgnoreCase(computerChoice)) {
      System.out.println("Good guess! Color was: " + computerChoice + "\n");
    } else {
      System.out.println("Bad guess! Color was: " + computerChoice + "\n");
    }
  }
}