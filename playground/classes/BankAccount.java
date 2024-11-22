import java.util.Scanner;

public class BankAccount {

  // Data Fields

  // Balance field with the current value of the account balance
  private double balance;

  // Methods

  // :: Constructor
  public BankAccount() {
    balance = 0.0;
  }

  public BankAccount(double startBalance) {
    balance = startBalance;
  }

  public BankAccount(String str) {
    balance = Double.parseDouble(str);
  }

  // Other Methods
  public void deposit(double amount) {
    balance += amount;
  }

  public void deposit(String str) {
    balance += Double.parseDouble(str);
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void withdraw(String str) {
    balance -= Double.parseDouble(str);
  }

  // Mutators (Setters)
  public void setBalance(double b) {
    balance = b;
  }

  public void setBalance(String str) {
    balance = Double.parseDouble(str);
  }

  // Accessors (Getters)
  public double getBalance() {
    return balance;
  }

}

public class BankAccountDemo {
  public static void main(String[] args) {

    BankAccount myAccount;
    myAccount = new BankAccount();

    System.out.println("Your account is created!");
    System.out.printf("Your balance is %f", myAccount.getBalance());
  }
}