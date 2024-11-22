import java.util.*;

class Payroll {
  private String name;
  private int idNumber;
  private double hourlyRate;
  private int hours;

  public Payroll(String name, int idNumber, double hourlyRate, int hours) {
    this.name = name;
    this.idNumber = idNumber;
    this.hourlyRate = hourlyRate;
    this.hours = hours;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  // Accessors (Getters)
  public String getName() {
    return name;
  }

  public int getIdNumber() {
    return idNumber;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public int getHours() {
    return hours;
  }

  // Mutators
  public double calcGrossPay(double hourlyRate, int hours) {
    return hourlyRate * hours;
  }
}

public class PayrollClass {

  public static void main(String[] args) {
    String name;
    int idNumber, hours;
    double hourlyRate;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter employee's name: ");
    name = keyboard.nextLine();
    System.out.println("Enter employee's id number: ");
    idNumber = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter employee's hourly rate: ");
    hourlyRate = keyboard.nextDouble();
    System.out.println("Enter employee's total worked hours: ");
    hours = keyboard.nextInt();
    keyboard.nextLine();

    Payroll employeePayroll = new Payroll(name, idNumber, hourlyRate, hours);
    System.out.printf("ID: %d\nName: %s\nHourly Rate: %.2f\nHours: %d\nGross Pay: $%.2f\n",
        employeePayroll.getIdNumber(), employeePayroll.getName(),
        employeePayroll.getHourlyRate(), employeePayroll.getHours(), employeePayroll.calcGrossPay(hourlyRate, hours));

    keyboard.close();
  }
}