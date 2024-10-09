import java.util.Scanner;

public class RomanNumerals {
  public static void main (String[] args) {
    
    int number;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Insert a number: ");
    number = keyboard.nextInt();

    switch(number)
    {
      case 1:
        System.out.println("i");
        break;
      case 2:
        System.out.println("ii");
        break;
      case 3:
        System.out.println("iii");
        break;
      case 4:
        System.out.println("iv");
        break;
      case 5:
        System.out.println("v");
        break;
      case 6:
        System.out.println("vi");
        break;
      case 7:
        System.out.println("vii");
        break;
      case 8:
        System.out.println("viii");
        break;
      case 9:
        System.out.println("ix");
        break;
      case 10:
        System.out.println("x");
        break;
      default:
        System.out.println(number + " is a number not within 1-10");
    }
  }
}