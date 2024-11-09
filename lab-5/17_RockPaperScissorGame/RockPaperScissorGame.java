import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {

  public static void main(String[] args) {

    int choice;
    String computerChoice, playerChoice = "";
    Scanner keyboard = new Scanner(System.in);

    String[] computerPick = {
        "Rock",
        "Paper",
        "Scissors",
    };

    Random random = new Random();
    int randomizer = random.nextInt(3);
    computerChoice = computerPick[randomizer];

    do {
      System.out.println("Let's play a game of Rock, Paper and Scissors!");
      System.out.println("Enter one of the following number in the menu: ");
      System.out.print("1. Rock \n2. Paper \n3. Scissors \n");
      choice = keyboard.nextInt();
      keyboard.nextLine();

      switch (choice) {
        case 1:
          playerChoice = "Rock";
          logicHandler(computerChoice, playerChoice);
          break;
        case 2:
          playerChoice = "Paper";
          logicHandler(computerChoice, playerChoice);
          break;
        case 3:
          playerChoice = "Scissors";
          logicHandler(computerChoice, playerChoice);
          break;
      }
    } while (computerChoice.equals(playerChoice));

    keyboard.close();
  }

  public static void logicHandler(String computerChoice, String playerChoice) {
    if (computerChoice.equals("Rock") && playerChoice.equals("Scissors")) {
      System.out.println("Computer's rock smashes player's scissors");
    } else if (computerChoice.equals("Scissors") && playerChoice.equals("Paper")) {
      System.out.println("Computer's scissors cuts player's paper");
    } else if (computerChoice.equals("Paper") && playerChoice.equals("Rock")) {
      System.out.println("Computer's paper wraps player's rock");
    } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
      System.out.println("Player's rock smashes computer's scissors");
    } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
      System.out.println("Player's scissors cuts computer's paper");
    } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
      System.out.println("Player's paper wraps computer's rock");
    } else {
      System.out.println("Both players chooses the same choice! Play again! \n");
    }
  }
}