// It wouldn't have been easier with [][]

import java.util.*;

class GradeBook {
  private String[] names = new String[5];
  private String[] grades = new String[5];
  private double[] scores_1 = new double[4];
  private double[] scores_2 = new double[4];
  private double[] scores_3 = new double[4];
  private double[] scores_4 = new double[4];
  private double[] scores_5 = new double[4];

  // Setters
  public void setNames(int index, String name) {
    this.names[index] = name;
  }

  public void setGrades(int index, String grade) {
    this.grades[index] = grade;
  }

  public void setScores1(int index, double score) {
    this.scores_1[index] = score;
  }

  public void setScores2(int index, double score) {
    this.scores_2[index] = score;
  }

  public void setScores3(int index, double score) {
    this.scores_3[index] = score;
  }

  public void setScores4(int index, double score) {
    this.scores_4[index] = score;
  }

  public void setScores5(int index, double score) {
    this.scores_5[index] = score;
  }

  // Getters
  public String[] getNames() {
    return names;
  }

  public String[] getGrades() {
    return grades;
  }

  public double[] getScores1() {
    return scores_1;
  }

  public double[] getScores2() {
    return scores_2;
  }

  public double[] getScores3() {
    return scores_3;
  }

  public double[] getScores4() {
    return scores_4;
  }

  public double[] getScores5() {
    return scores_5;
  }

  // Mutators
  public double findAverage(double[] arr) {
    return (arr[0] + arr[1] + arr[2] + arr[3]) / 4;
  }

  public String gradeAverage(double averageGrade) {
    if (averageGrade >= 90 && averageGrade <= 100) {
      return "A";
    } else if (averageGrade >= 80 && averageGrade <= 89) {
      return "B";
    } else if (averageGrade >= 70 && averageGrade <= 79) {
      return "C";
    } else if (averageGrade >= 60 && averageGrade <= 79) {
      return "D";
    } else {
      return "F";
    }
  }
}

public class GradeBookClass {
  public static void main(String[] args) {
    String name, gradeAverage1, gradeAverage2, gradeAverage3, gradeAverage4, gradeAverage5;
    double score, averageScore1, averageScore2, averageScore3, averageScore4, averageScore5;
    Scanner keyboard = new Scanner(System.in);
    GradeBook gradebook = new GradeBook();

    for (int i = 0; i < 5; i++) {
      System.out.printf("Enter student %d's name: ", i + 1);
      name = keyboard.nextLine();
      gradebook.setNames(i, name);
    }

    for (int j = 0; j < 4; j++) {
      String scoreOrder = "";
      switch (j) {
        case 0:
          scoreOrder = "first";
          break;
        case 1:
          scoreOrder = "second";
          break;
        case 2:
          scoreOrder = "third";
          break;
        case 3:
          scoreOrder = "fourth";
          break;
      }
      System.out.printf("Enter %s's %s score: ", gradebook.getNames()[0], scoreOrder);
      score = keyboard.nextDouble();
      gradebook.setScores1(j, score);
    }

    for (int j = 0; j < 4; j++) {
      String scoreOrder = "";
      switch (j) {
        case 0:
          scoreOrder = "first";
          break;
        case 1:
          scoreOrder = "second";
          break;
        case 2:
          scoreOrder = "third";
          break;
        case 3:
          scoreOrder = "fourth";
          break;
      }
      System.out.printf("Enter %s's %s score: ", gradebook.getNames()[1], scoreOrder);
      score = keyboard.nextDouble();
      gradebook.setScores2(j, score);
    }

    for (int j = 0; j < 4; j++) {
      String scoreOrder = "";
      switch (j) {
        case 0:
          scoreOrder = "first";
          break;
        case 1:
          scoreOrder = "second";
          break;
        case 2:
          scoreOrder = "third";
          break;
        case 3:
          scoreOrder = "fourth";
          break;
      }
      System.out.printf("Enter %s's %s score: ", gradebook.getNames()[2], scoreOrder);
      score = keyboard.nextDouble();
      gradebook.setScores3(j, score);
    }

    for (int j = 0; j < 4; j++) {
      String scoreOrder = "";
      switch (j) {
        case 0:
          scoreOrder = "first";
          break;
        case 1:
          scoreOrder = "second";
          break;
        case 2:
          scoreOrder = "third";
          break;
        case 3:
          scoreOrder = "fourth";
          break;
      }
      System.out.printf("Enter %s's %s score: ", gradebook.getNames()[3], scoreOrder);
      score = keyboard.nextDouble();
      gradebook.setScores4(j, score);
    }

    for (int j = 0; j < 4; j++) {
      String scoreOrder = "";
      switch (j) {
        case 0:
          scoreOrder = "first";
          break;
        case 1:
          scoreOrder = "second";
          break;
        case 2:
          scoreOrder = "third";
          break;
        case 3:
          scoreOrder = "fourth";
          break;
      }
      System.out.printf("Enter %s's %s score: ", gradebook.getNames()[4], scoreOrder);
      score = keyboard.nextDouble();
      gradebook.setScores5(j, score);
    }

    double[] averageGradeArr = {
        averageScore1 = gradebook.findAverage(gradebook.getScores1()),
        averageScore2 = gradebook.findAverage(gradebook.getScores2()),
        averageScore3 = gradebook.findAverage(gradebook.getScores3()),
        averageScore4 = gradebook.findAverage(gradebook.getScores4()),
        averageScore5 = gradebook.findAverage(gradebook.getScores5())
    };

    averageScore1 = gradebook.findAverage(gradebook.getScores1());
    averageScore2 = gradebook.findAverage(gradebook.getScores2());
    averageScore3 = gradebook.findAverage(gradebook.getScores3());
    averageScore4 = gradebook.findAverage(gradebook.getScores4());
    averageScore5 = gradebook.findAverage(gradebook.getScores5());

    String[] gradeAverageArr = {
        gradeAverage1 = gradebook.gradeAverage(averageScore1),
        gradeAverage2 = gradebook.gradeAverage(averageScore2),
        gradeAverage3 = gradebook.gradeAverage(averageScore3),
        gradeAverage4 = gradebook.gradeAverage(averageScore4),
        gradeAverage5 = gradebook.gradeAverage(averageScore5)
    };

    for (int p = 0; p < 5; p++) {
      gradebook.setGrades(p, gradeAverageArr[p]);
    }

    for (int m = 0; m < 5; m++) {
      System.out.printf("\nStudent %s has average score of %.2f. Their final grade is %s\n", gradebook.getNames()[m],
          averageGradeArr[m], gradeAverageArr[m]);
    }
    keyboard.close();
  }
}