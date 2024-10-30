import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    int num, sum = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a positive nonzero integer value: ");
    num = keyboard.nextInt();
    keyboard.nextLine();

    while (num <= 0) {
      System.out.println("Please enter a positive nonzero integer value: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
    }

    for (int i = 0; i <= num; i++) {
      sum = sum + i;
    }
    System.out.printf("The sum of all numbers from 0 to %d is %d \n",num, sum);

    keyboard.close();
  }
}