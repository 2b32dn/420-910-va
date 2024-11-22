import java.util.*;

class Test {
  private int score1;
  private int score2;
  private int score3;

  // Constructor (Same name as the class)
  public Test(int score1, int score2, int score3) {
    this.score1 = score1;
    this.score2 = score2;
    this.score3 = score3;
  }

  // Mutator (Setters)
  public void setScore1(int score) {
    score1 = score;
  }

  public void setScore2(int score) {
    score2 = score;
  }

  public void setScore3(int score) {
    score3 = score;
  }

  // Calculate Average
  public int calcAverage() {
    return (score1 + score2 + score3) / 3;
  }

  // Accessors (Getters)
  public int getScore1() {
    return score1;
  }

  public int getScore2() {
    return score2;
  }

  public int getScore3() {
    return score3;
  }
}

public class TestScoresClass {

  public static void main(String[] args) {
    int score1, score2, score3;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first score: ");
    score1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter the second score: ");
    score2 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter the third score: ");
    score3 = keyboard.nextInt();
    keyboard.nextLine();

    Test test = new Test(score1, score2, score3);

    System.out.printf("Your average is %d", test.calcAverage());

    keyboard.close();
  }
}