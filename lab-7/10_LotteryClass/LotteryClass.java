import java.util.*;

class Lottery {
  private int lotteryArr[] = new int[5];
  private int userArr[] = new int[5];

  public Lottery() {
    Random random = new Random();
    for (int i = 0; i < lotteryArr.length; i++) {
      lotteryArr[i] = random.nextInt(10);
    }
  }

  // Setters
  public void setUserArr(int index, int num) {
    this.userArr[index] = num;
  }

  // Getters
  public int[] getLotteryArr() {
    return lotteryArr;
  }

  public int[] getUserArr() {
    return userArr;
  }

  public int getUserArrCount() {
    return userArr.length;
  }

  // Methods
  public int compareResults(int[] userArr) {
    int matchCount = 0;
    for (int i = 0; i < lotteryArr.length; i++) {
      if (lotteryArr[i] == userArr[i]) {
        matchCount++;
      }
    }
    return matchCount;
  }
}

public class LotteryClass {

  public static void main(String[] args) {
    int num, matches;
    Lottery lottery = new Lottery();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter 5 single digit numbers (0-9): ");
    for (int i = 0; i < lottery.getUserArrCount(); i++) {
      do {
        System.out.printf("Number %d: ", i + 1);
        num = keyboard.nextInt();
        keyboard.nextLine();
        lottery.setUserArr(i, num);
      } while (num > 9);
    }

    matches = lottery.compareResults(lottery.getUserArr());

    for (int i = 0; i < 5; i++) {
      System.out.println(lottery.getUserArr()[i]);
    }

    System.out.printf("Lottery Numbers - User Numbers\n");
    for (int i = 0; i < lottery.getUserArrCount(); i++) {
      System.out.printf("%3s%20s\n", lottery.getLotteryArr()[i],
          lottery.getUserArr()[i]);
    }

    System.out.printf("\nNumber of matches: %d\n", matches);
    if (matches == 5) {
      System.out.println("Congratulations! You won the lottery!");
    } else {
      System.out.println("Better luck next time!");
    }
    keyboard.close();
  }
}