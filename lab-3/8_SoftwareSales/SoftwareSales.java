import java.util.Scanner;

public class SoftwareSales {
  public static void main (String[] args) {

    double packageAmount, discount, discountPercent, total, totalAfterDiscount;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Input amount of packages: ");
    packageAmount = keyboard.nextDouble();
    keyboard.nextLine();

    total = packageAmount * 99 ;

    if (packageAmount < 10) {
      System.out.println("Total: " + packageAmount * 99 + "$");
      System.out.println("Not enough packages for a discount.");
      
    } else if (packageAmount >= 10 && packageAmount <= 19) {

      discountPercent = 0.2;
      discount = packageAmount * 99  * discountPercent;
      totalAfterDiscount = total - discount;
      
      System.out.println("Total: " + total + "$");
      System.out.println("Discount: " + packageAmount * 99  * discountPercent + "$");
      System.out.println("Total After Discount: " + totalAfterDiscount + "$");

    } else if (packageAmount >= 20 && packageAmount <= 49) {

      discountPercent = 0.3;
      discount = packageAmount * 99  * discountPercent;
      totalAfterDiscount = total - discount;

      System.out.println("Total: " + total + "$");
      System.out.println("Discount: " + packageAmount * 99  * discountPercent + "$");
      System.out.println("Total After Discount: " + totalAfterDiscount + "$");

    } else if (packageAmount >= 50 && packageAmount <= 99) {

      discountPercent = 0.4;
      discount = packageAmount * 99  * discountPercent;
      totalAfterDiscount = total - discount;

      System.out.println("Total: " + total + "$");
      System.out.println("Discount: " + packageAmount * 99  * discountPercent + "$");
      System.out.println("Total After Discount: " + totalAfterDiscount + "$");

    } else {

      discountPercent = 0.5;
      discount = packageAmount * 99  * discountPercent;
      totalAfterDiscount = total - discount;

      System.out.println("Total: " + total+ "$");
      System.out.println("Discount: " + packageAmount * 99 * discountPercent + "$");
      System.out.println("Total After Discount: " + totalAfterDiscount + "$");
    }
  }
}