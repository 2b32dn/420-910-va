import java.util.*;

class SavingsAccount {
  private double balance;
  private double annualInterestRate;

  public SavingsAccount(double balance) {
    this.balance = balance;
  }

  // Setters
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnnualInterestRate(double rate) {
    this.annualInterestRate = rate;
  }

  public void setWithdrawal(double amount) {
    balance -= amount;
  }

  public void setDeposit(double amount) {
    balance += amount;
  }

  public void AddMonthlyBalance() {
    double monthlyInterestRate = annualInterestRate / 12;
    balance += (balance * monthlyInterestRate);
  }

  // Getters
  public double getBalance() {
    return balance;
  }

  public double getannualInterestRate() {
    return annualInterestRate;
  }

}

public class SavingsAccountClass {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the annual interest rate (in percentage): ");
    double interestRate = keyboard.nextDouble();
    System.out.println("Enter the starting balance: ");
    double initialBalance = keyboard.nextDouble();
    System.out.println("Enter the amount of months: ");
    int months = keyboard.nextInt();
    keyboard.nextLine();

    SavingsAccount acc = new SavingsAccount(initialBalance);
    acc.setAnnualInterestRate(interestRate / 100);

    double totalDeposits = 0, totalWithdrawals = 0, totalInterest = 0;

    for (int i = 1; i <= months; i++) {
      System.out.printf("Month %d: \n", i);

      System.out.println("Enter deposit amount: ");
      double deposit = keyboard.nextDouble();
      acc.setDeposit(deposit);
      totalDeposits += deposit;

      System.out.println("Enter withdrawal amount: ");
      double withdrawal = keyboard.nextDouble();
      acc.setWithdrawal(withdrawal);
      totalWithdrawals += withdrawal;

      acc.AddMonthlyBalance();
      totalInterest += acc.getBalance() * (interestRate / 12);
    }

    System.out.printf("\nTotal Balance: $%.2f\n", acc.getBalance());
    System.out.printf("Total Deposits: $%.2f\n", totalDeposits);
    System.out.printf("Total Withdrawals: $%.2f\n", totalWithdrawals);
    System.out.printf("Total interest earned: $%.2f\n", totalInterest);

    keyboard.close();
  }
}