import java.util.Scanner;
import java.text.DecimalFormat;

public class StockTransactionProgram {

  // To remove trailing zeroes and round up decimals
  private static final DecimalFormat df = new DecimalFormat("0.00");

  public static void main (String[] args) {
    
    double amountofShares = 1000;
    double amountOfStockBefore = amountofShares * 32.87;
    double commissionBefore = amountOfStockBefore * 0.02; 
    double amountOfStockAfter = amountofShares * 33.92; 
    double commissionAfter = amountOfStockAfter * 0.02;
    double profit = (amountOfStockAfter - amountOfStockBefore) - (commissionBefore + commissionAfter);

    System.out.println("The amount of money Joe paid for the stock initially is: " + amountOfStockBefore + "$");
    System.out.println("The amount of commission Joe paid for his broker is: " + commissionBefore + "$");
    System.out.println("The amount of money Joe paid for the stock two weeks later is: " + amountOfStockAfter+ "$");
    System.out.println("The amount of commission Joe paid for his broker again is: " + commissionAfter + "$");
    System.out.println("The profit Joe made with all these transactions: " + df.format(profit) + "$");
  }
}