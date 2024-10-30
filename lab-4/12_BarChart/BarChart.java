import java.util.Scanner;

public class BarChart {
  public static void main(String[] args) {

    int sales = 0, sales_1, sales_2, sales_3, sales_4, sales_5;
    Scanner keyboard = new Scanner(System.in);

    System.out.printf("Enter today's sales for store 1: ");
    sales_1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.printf("Enter today's sales for store 2: ");
    sales_2 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.printf("Enter today's sales for store 3: ");
    sales_3 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.printf("Enter today's sales for store 4: ");
    sales_4 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.printf("Enter today's sales for store 5: ");
    sales_5 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("\nSALES BAR CHART");

    for (int i = 1; i <= 5; i++) {
      System.out.printf("Enter today %d: ", i);
      switch (i) {
        case 1:
          sales = sales_1;
          break;
        case 2:
          sales = sales_2;
          break;
        case 3:
          sales = sales_3;
          break;
        case 4:
          sales = sales_4;
          break;
        case 5:
          sales = sales_5;
      }

      for (int j = 1; j <= sales / 100; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    keyboard.close();
  }
}