import java.util.Scanner;

public class ShowChar {
  public static void main(String[] args) {
    String word;
    int num;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a word: ");
    word = keyboard.nextLine();

    System.out.println("Enter a integer: ");
    num = keyboard.nextInt();
    keyboard.nextLine();

    while (num > word.length()) {
      System.out.println("Enter a integer smaller than the word's length: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
    }

    showChar(word, num);

    keyboard.close();
  }

  public static void showChar(String word, int num) {
    char singleChar = word.charAt(num);

    System.out.printf("The character %s is in position %d", singleChar, num);
  }
}