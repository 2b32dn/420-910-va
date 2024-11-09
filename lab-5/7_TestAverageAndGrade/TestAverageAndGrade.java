import java.util.Scanner;

public class TestAverageAndGrade {
  public static void main(String[] args) {

    double score1, score2, score3, score4, score5, calcAverage;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Hello User, please enter five test scores. We will calculate your average and provide grade.");

    System.out.println("Enter the first test score:");
    score1 = keyboard.nextDouble();
    while (score1 > 100) {
      System.out.println("Enter the first test score:");
      score1 = keyboard.nextDouble();
    }

    System.out.println("Enter the second test score:");
    score2 = keyboard.nextDouble();
    while (score2 > 100) {
      System.out.println("Enter the second test score:");
      score2 = keyboard.nextDouble();
    }

    System.out.println("Enter the third test score:");
    score3 = keyboard.nextDouble();
    while (score3 > 100) {
      System.out.println("Enter the third test score:");
      score3 = keyboard.nextDouble();
    }

    System.out.println("Enter the fourth test score:");
    score4 = keyboard.nextDouble();
    while (score4 > 100) {
      System.out.println("Enter the fourth test score:");
      score4 = keyboard.nextDouble();
    }

    System.out.println("Enter the fifth test score:");
    score5 = keyboard.nextDouble();
    while (score5 > 100) {
      System.out.println("Enter the fifth test score:");
      score5 = keyboard.nextDouble();
    }

    calcAverage = calcAverage(score1, score2, score3, score4, score5);
    System.out.printf("Your average grade is %.1f \n", calcAverage);
    determineGrade(calcAverage);

    keyboard.close();
  }

  public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
    return (score1 + score2 + score3 + score4 + score5) / (double) 5;
  }

  public static void determineGrade(double calcAverage) {
    if (calcAverage > 90 && calcAverage < 100) {
      System.out.println("Your grade is: A");
    } else if (calcAverage > 80 && calcAverage < 89) {
      System.out.println("Your grade is: B");
    } else if (calcAverage > 70 && calcAverage < 79) {
      System.out.println("Your grade is: C");
    } else if (calcAverage > 60 && calcAverage < 79) {
      System.out.println("Your grade is: D");
    } else {
      System.out.println("Your grade is: F");
    }
  }
}