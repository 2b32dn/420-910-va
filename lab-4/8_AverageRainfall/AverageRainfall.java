import java.util.Scanner;

public class AverageRainfall {
  public static void main(String[] args) {

    double years;
    double totalRainfall = 0, monthlyRainfall, averageRainfall = 0, totalMonths = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter number of years to calculate the average rainfall over a period of years: ");
    years = keyboard.nextDouble();
    keyboard.nextLine();

    while (years < 0) {
      years = keyboard.nextDouble();
      keyboard.nextLine();
    }
    for (int i = 1; i <= years; i++) {
      System.out.println(i);
      for (int j = 0; j < 12; j++) {
        String[] month = {
            "Jan",
            "Feb",
            "March",
            "April",
            "May",
            "June",
            "July",
            "Aug",
            "Sept",
            "Oct",
            "Nov",
            "Dec"
        };

        System.out.printf("Enter the average rainfall in inches in the " + month[j] + ":\n", j);
        monthlyRainfall = keyboard.nextDouble();
        keyboard.nextLine();

        while (monthlyRainfall < 0) {
          monthlyRainfall = keyboard.nextDouble();
          keyboard.nextLine();
        }

        totalRainfall = totalRainfall + monthlyRainfall;
        totalMonths = 12 * years;
        averageRainfall = totalRainfall / (totalMonths);

      }

      System.out.printf("Total Rainfall: %.2f inches\n", totalRainfall);
      System.out.printf("Average Rainfall: %.2f inches\n", averageRainfall);

    }
    System.out.printf("Total Months: %.2f \n", totalMonths);
    keyboard.close();
  }
}
