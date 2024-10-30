import java.util.Scanner;

public class SlotMachine {
  public static void main(String[] args) {

    int random_1 = 0, random_2 = 0, random_3 = 0, amount, total = 0, totalWon;
    int count = 1;
    Scanner keyboard = new Scanner(System.in);
    String word_1, word_2, word_3, valid = "n";
    String[] words = {
        "Cherries",
        "Oranges",
        "Plums",
        "Bells",
        "Melons",
        "Bars"
    };

    System.out.println("Enter the amount of money into the slot machine: ");
    amount = keyboard.nextInt();
    keyboard.nextLine();

    while (count <= 3) {
      int randomizer = (int) Math.floor((Math.random() * 5) + 1);

      if (count == 1) {
        random_1 = randomizer;
      } else if (count == 2) {
        random_2 = randomizer;
      } else {
        random_3 = randomizer;
      }
      count++;
    }

    word_1 = words[random_1];
    word_2 = words[random_2];
    word_3 = words[random_3];

    if (word_1.compareTo(word_2) == 0
        && word_1.compareTo(word_3) == 0
        && word_2.compareTo(word_1) == 0
        && word_2.compareTo(word_3) == 0
        && word_3.compareTo(word_1) == 0
        && word_3.compareTo(word_2) == 0) {

      total = amount * 3;
      totalWon = total;

      System.out.println(total);
      System.out.println("three words are equal");

    } else if (word_1.compareTo(word_2) == 0
        || word_1.compareTo(word_3) == 0
        || word_2.compareTo(word_1) == 0
        || word_2.compareTo(word_3) == 0
        || word_3.compareTo(word_1) == 0
        || word_3.compareTo(word_2) == 0) {

      total = amount * 2;
      totalWon = total;
      System.out.println(total);
      System.out.println("two words are equal");

    } else {
      totalWon = amount + total;
      System.out.println("words are not equal");
    }

    System.out.println("[Slot machine spins...]");
    System.out.printf("Results: %s, %s, %s\n", word_1, word_2, word_3);

    System.out.println(totalWon);

    if (total > 0) {
      System.out.println("Do you want to play again? Press Y or N");
      valid = "y";
    } else {
      // System.out.printf("Total amount entered: %d \n", amount);
      // System.out.printf("Total amount won: %d", total);
    }

    keyboard.close();
  }
}