import java.util.Scanner;

public class BudgetAnalysis {
  public static void main(String[] args) {
    int budget, expanse, totalBudget, totalExpanse = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an budget amount for this month: ");
    budget = keyboard.nextInt();
    totalBudget = budget;
    keyboard.nextLine();

    while (budget > 0) {
      System.out.println("Enter an expanse (or -1 to end): ");
      expanse = keyboard.nextInt();
      keyboard.nextLine();

      if (expanse == -1) {
        break;
      }

      budget = budget - expanse;
      totalExpanse = totalExpanse + expanse;

    }

    if (budget == 0) {
      System.out.printf("Total expenses: %d$ \n", totalBudget);
      System.out.printf("You are exactly on budget.");
    } else if (budget < totalExpanse) {
      System.out.printf("Total expenses: %d$ \n", totalExpanse);
      System.out.printf("You are over budget by %d$", budget * -1);
    } else {
      System.out.printf("Total expenses: %d$ \n", totalExpanse);
      System.out.printf("You are under budget by %d$", budget);
    }

    keyboard.close();
  }
}