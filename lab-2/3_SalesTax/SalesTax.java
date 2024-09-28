import java.util.Scanner;

public class SalesTax {
  public static void main(String[] args) {

    double purchaseAmount;
    double stateSalesTax;
    double countySalesTax;
    double totalSalesTax;
    double sumOfTotalPurchase;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the amount of your purchase?");
    purchaseAmount = keyboard.nextDouble();

    stateSalesTax = purchaseAmount * 0.04;
    countySalesTax = purchaseAmount * 0.02;
    totalSalesTax = stateSalesTax + countySalesTax;
    sumOfTotalPurchase = purchaseAmount + totalSalesTax;

    System.out.println("The amount of the purchase is: " + purchaseAmount);
    System.out.println("The amount of the state sales tax on the purchase is: " + stateSalesTax);
    System.out.println("The amount of the county sales tax on the purchase is: " + countySalesTax);
    System.out.println("The total of the purchase with state and county sale tax is: " + sumOfTotalPurchase);

    keyboard.close();
  }
}