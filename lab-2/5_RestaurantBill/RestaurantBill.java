import java.util.Scanner;
import java.text.DecimalFormat;

public class RestaurantBill {

  // To remove trailing zeroes and round up decimals
  private static final DecimalFormat df = new DecimalFormat("0.00");

  public static void main (String[] args) {

    double meal;
    double tax;
    double tips;
    double total;
    Scanner userInput = new Scanner(System.in);

    System.out.println("How much was the meal?");
    meal = userInput.nextDouble();

    tax = meal * 0.0675;
    tips = (meal + tax) * 0.2;
    total = meal + tax + tips;

    System.out.println("The cost of the meal is: " + meal);
    System.out.println("The tax amount on the meal is: " + df.format(tax));
    System.out.println("The tip amount on the meal is: " + df.format(tips));
    System.out.println("The total amount on the meal with tax and tips is: " + total);

    userInput.close();
  }
}