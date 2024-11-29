import java.util.*;

class PayRoll {
  private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
  private int[] hours = new int[7];
  private double[] payRate = new double[7];
  private double[] wages = new double[7];

  // Setters

  public void setHours(int index, int hours) {
    this.hours[index] = hours;
  }

  public void setPayrate(int index, double payrate) {
    this.payRate[index] = payrate;
  }

  // Accessors (Getters)
  public int[] getEmployeeId() {
    return employeeId;
  }

  public int[] getHours() {
    return hours;
  }

  public double[] getPayRate() {
    return payRate;
  }

  public double[] getWages() {
    return wages;
  }

  public int getEmployeeId(int index) {
    return employeeId[index];
  }

  public int getEmployeeCount() {
    return employeeId.length;
  }

  // Mutators
  public void calculateAllWage() {
    for (int i = 0; i < employeeId.length; i++) {
      wages[i] = hours[i] * payRate[i];
    }
  }
}

public class PayrollClass {
  public static void main(String[] args) {
    double payRateInput;
    int hoursInput;
    Scanner keyboard = new Scanner(System.in);
    PayRoll payroll = new PayRoll();

    System.out.println("Enter the hours worked and pay rate for each employee");

    for (int i = 0; i < payroll.getEmployeeCount(); i++) {

      // Get Employee Id
      int employeeId = payroll.getEmployeeId(i);

      // Ask user to enter Employee's payrate
      do {
        System.out.printf("Employee #%d's pay rate: ", employeeId);
        payRateInput = keyboard.nextDouble();
      } while (payRateInput < 7);

      // Ask user to enter Employee's worked hours
      do {
        System.out.printf("Employee #%d's hours: ", employeeId);
        hoursInput = keyboard.nextInt();
        keyboard.nextLine();
      } while (hoursInput < 0);

      // Set Payrate and hours for each employee into their respective array
      payroll.setPayrate(i, payRateInput);
      payroll.setHours(i, hoursInput);
    }

    payroll.calculateAllWage();

    // Get all employee's data
    System.out.printf("\n%1s%15s%14s%20s%27s\n", "Employee", "ID Number", "Hours", "Pay Rate", "Gross Pay");
    System.out.println("--------------------------------------------------------------------------------------");
    for (int i = 0; i < 7; i++) {
      System.out.printf("%1s%20s%16s%21s%26s\n", i + 1, payroll.getEmployeeId(i), payroll.getHours()[i],
          payroll.getPayRate()[i], payroll.getWages()[i]);
    }

    keyboard.close();
  }
}