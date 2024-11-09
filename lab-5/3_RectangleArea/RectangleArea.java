import java.util.Scanner;

public class RectangleArea {
  public static void main(String[] args) {
    double width, length, area;

    System.out.println("For the following rectangle");

    length = getLength();
    width = getWidth();
    area = getArea(width, length);
    displayData(width, length, area);
  }

  public static double getWidth() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter its width: ");

    return keyboard.nextDouble();
  }

  public static double getLength() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter its length: ");

    return keyboard.nextDouble();
  }

  public static double getArea(double width, double length) {
    double area;
    area = width * length;
    return area;
  }

  public static void displayData(double width, double length, double area) {
    System.out.printf("The rectangle's dimension: \nwidth: %.2f \nlength: %.2f \narea: %.2f", width, length, area);
  }
}