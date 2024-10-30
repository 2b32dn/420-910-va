import java.util.Scanner;

public class SquareDisplay {
  public static void main(String[] args) {

    int num;
    String star = "*";
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a digit not greater than 15: ");
    num = keyboard.nextInt();
    keyboard.nextLine();

    while (num > 15) {
      System.out.println("Please, enter a digit not greater than 15: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
    }

    for (int i = 0; i < num; i++) {
      // System.out.println(star.repeat(num));
      for (int j = 0; j < num; j++) {
        System.out.print(star);
      }
      System.out.println("");
    }

    keyboard.close();
  }
}