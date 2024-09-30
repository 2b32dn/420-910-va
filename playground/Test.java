import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    int amount1, amount2;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Insert a value for amount1: ");
    amount1 = keyboard.nextInt();
    System.out.print("Insert a value for amount2: ");
    amount2 = keyboard.nextInt();

    if (amount1 > 10 && amount2 < 100) {
      if (amount1 > amount2) {
        System.out.println(amount1);
      } else {
        System.out.println(amount2);
      }
    } else {
      if (amount1 == 10) {
        System.out.println(amount1 + " is equal to 10");
      }
      if (amount2 == 100) {
        System.out.println(amount1 + " is equal to 100");
      }
      if (amount1 < 10) {
        System.out.println(amount1 + " is not greater than 10");
      }
      if (amount1 > 10){
        System.out.println(amount1 + " is greater than 10");
      }
      if (amount2 < 100) {
        System.out.println(amount2 + " is less than 100");
      } 
      if (amount2 > 100) {
        System.out.println(amount2 + " is greater than 100");
      }
    }
  }
}