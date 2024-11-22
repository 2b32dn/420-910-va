import java.util.*;

class Circle {
  private double radius;
  final private double PI = 3.14159;

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
    radius = 0.0;
  }

  // Setters
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Accessors (Getters)
  public double getRadius() {
    return radius;
  }

  // Mutators
  public double getArea(double radius) {
    return PI * radius * radius;
  }

  public double getDiameter(double radius) {
    return radius * 2;
  }

  public double getCircumference(double radius) {
    return 2 * PI * radius;
  }
}

public class CircleClass {

  public static void main(String[] args) {
    double radius;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a circle's radius: ");
    radius = keyboard.nextInt();
    keyboard.nextLine();

    Circle circle = new Circle(radius);

    System.out.printf("Radius: %.2f\nArea: %.2f\nDiameter: %.2f\nCircumference: %.2f\n", circle.getRadius(),
        circle.getArea(radius), circle.getDiameter(radius), circle.getCircumference(radius));

    keyboard.close();
  }
}