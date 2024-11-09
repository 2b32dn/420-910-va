import java.util.Scanner;

public class RetailPriceCalculator {
  public static void main(String[] args) {
    double item, markup;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an item's wholesale price: ");
    item = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the item's markup percentage: ");
    markup = keyboard.nextDouble();
    keyboard.nextLine();

    calculateRetail(item, markup);
    keyboard.close();
  }

  public static void calculateRetail(double item, double markup) {
    double percentage, total, markupPrice;
    percentage = ((markup / 100) * 100);
    markupPrice = 1 + (markup / 100);
    total = item * markupPrice;

    System.out.printf("Item's wholesale price: %.2f$ \n Item's markup: %.2f%% \n Item's retail price: %.2f$ \n", item,
        percentage,
        total);
  }
}