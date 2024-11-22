import java.util.*;

class Car {
  private int yearModel;
  private String make;
  private int speed;

  // Constructors
  public Car(int year, String make) {
    this.yearModel = year;
    this.make = make;
  }

  // Mutators (Setters)
  public void setAcceleration() {
    this.speed += 5;
  }

  public void setBrake() {
    this.speed -= 5;
  }

  // Accessors (Getters)
  public int getYearModel() {
    return yearModel;
  }

  public String getMake() {
    return make;
  }

  public int getSpeed() {
    return speed;
  }
}

public class CarClass {

  public static void main(String[] args) {
    int yearModel;
    String make;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the car's year of production: ");
    yearModel = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter the car's brand: ");
    make = keyboard.nextLine();

    Car car = new Car(yearModel, make);

    for (int i = 0; i < 5; i++) {
      car.setAcceleration();
      System.out.printf("Your %d %s is driving at %d Km/h \n", car.getYearModel(), car.getMake(), car.getSpeed());
    }

    for (int i = 0; i < 5; i++) {
      car.setBrake();
      System.out.printf("Your %d %s is driving at %d Km/h \n", car.getYearModel(), car.getMake(), car.getSpeed());
    }
    keyboard.close();
  }
}