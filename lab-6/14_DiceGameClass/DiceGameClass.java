import java.util.*;

class DiceGame {
  private int sides;
  private int value;

  public DiceGame(int sides) {
    this.sides = sides;
    rollDice();
  }

  // Getters
  public int getSides() {
    return sides;
  }

  public int getValue() {
    return value;
  }

  // Mutators
  public void rollDice() {
    Random rand = new Random();
    value = rand.nextInt(sides) + 1;
  }
}

public class DiceGameClass {

  public static void main(String[] args) {
    final int DIE1_SIDES = 6;
    final int DIE2_SIDES = 6;
    final int ITERATIONS = 10;
    int totalPlayerWin = 0, totalComputerWin = 0;

    for (int i = 1; i <= ITERATIONS; i++) {
      DiceGame dice1 = new DiceGame(DIE1_SIDES);
      DiceGame dice2 = new DiceGame(DIE2_SIDES);

      System.out.printf("Round %d: \n", i);
      if (dice1.getValue() > dice2.getValue()) {
        System.out.printf("Player's %d dice roll beats Computer's %d dice roll\n", dice1.getValue(), dice2.getValue());
        totalPlayerWin++;
      } else if (dice1.getValue() < dice2.getValue()) {
        System.out.printf("Player's %d dice roll lost to Computer's %d dice roll\n", dice1.getValue(),
            dice2.getValue());
        totalComputerWin++;
      } else {
        System.out.printf("Player's %d dice roll tied with Computer's %d dice roll\n", dice1.getValue(),
            dice2.getValue());
      }
    }
    if (totalPlayerWin > totalComputerWin) {
      System.out.println("\nScoreboard");
      System.out.printf("Player: %d Computer: %d\n", totalPlayerWin, totalComputerWin);
      System.out.println("Fatality. Player Wins.");
    } else if (totalPlayerWin < totalComputerWin) {
      System.out.println("\nScoreboard");
      System.out.printf("Player: %d Computer: %d\n", totalPlayerWin, totalComputerWin);
      System.out.println("Fatality. Computer Wins.");
    } else {
      System.out.println("\nScoreboard");
      System.out.printf("Player: %d Computer: %d\n", totalPlayerWin, totalComputerWin);
      System.out.println("Tie Game");
    }
  }
}