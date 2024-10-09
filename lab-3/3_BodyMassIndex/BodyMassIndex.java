import java.util.Scanner;

public class BodyMassIndex {
  public static void main (String[] args) {

    double weight, height, BMI;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Input weight in kilogram: ");
    weight = keyboard.nextDouble();

    System.out.print("Input height in meters: ");
    height = keyboard.nextDouble();

    BMI = weight / (height * height);

    System.out.println("Your Body Mass Index (BMI) is " + BMI + " kg/m2");

    if (BMI >= 18.5 && BMI <= 25) {
      System.out.println("Your BMI is at an optimal range.");
    } else if (BMI < 18.5) {
      System.out.println("You're underweight.");
    } else {
      System.out.println("You're overweight.");
    }
  }
}