import java.util.Scanner;

public class SpeedVariable {
  public static void main (String[] args) {
    int speed;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Insert a number: ");
    speed = keyboard.nextInt();

    if (speed >= 0 && speed <= 200) {
      System.out.println("The number is valid");
    } else {
      System.out.println("The number is not valid");
    }
    
    keyboard.close();
  }
}