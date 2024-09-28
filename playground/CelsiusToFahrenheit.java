import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    double celsius;
    double fahrenheit;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Insert Temperature: ");
    celsius = keyboard.nextDouble();

    fahrenheit = (celsius * 9/5) + 32;

    System.out.println(celsius + "°C is " + fahrenheit + "F");
  }
}