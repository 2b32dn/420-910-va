import java.util.Scanner;

public class ShippingCharges {
  public static void main (String[] args) {

    double distance, distanceRemainder, distanceMultiplier, weight, total;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter Weight: ");
    weight = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.print("Enter distance: ");
    distance = keyboard.nextDouble();
    keyboard.nextLine();

    distanceRemainder = distance % 500;
    distanceMultiplier = distance / 500;

    if(weight < 2) {
      if(distanceRemainder == 0.0) {
        total = distanceMultiplier * 1.1;
        System.out.printf("$ %.2f" , total);
      } else {
        total = (distanceMultiplier + 1) * 1.1;
        System.out.printf("$ %.2f" , total);
      }
    } else if (weight > 2 && weight <= 6) {
      if(distanceRemainder == 0.0) {
        total = distanceMultiplier * 2.2;
        System.out.printf("$ %.2f" , total);
      } else {
        total = (distanceMultiplier + 1) * 2.2;
        System.out.printf("$ %.2f" , total);
      }
    } else if (weight > 6 && weight <= 10) {

      if(distanceRemainder == 0.0) {
        total = distanceMultiplier * 3.7;
        System.out.printf("$ %.2f" , total);
      } else {
        total = (distanceMultiplier + 1) * 3.7;
        System.out.printf("$ %.2f" , total);
      }
    } else {
      if(distanceRemainder == 0.0) {
        total = distanceMultiplier * 3.8;
        System.out.printf("$ %.2f" , total);
      } else {
        total = (distanceMultiplier + 1) * 3.8;
        System.out.printf("$ %.2f" , total);
      }
    }
  }
}