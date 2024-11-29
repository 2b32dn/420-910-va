import java.util.*;

public class LargerThanNClass {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int arraySize, arrayInt, nvalue;
    Scanner keyboard = new Scanner(System.in);

    do {
      System.out.println("Enter the size of the array: ");
      arraySize = keyboard.nextInt();
      keyboard.nextLine();
    } while (arraySize <= 2);

    for (int i = 0; i < arraySize; i++) {
      System.out.println("Add an integer into the array: ");
      arrayInt = keyboard.nextInt();
      keyboard.nextLine();

      arr.add(arrayInt);
    }

    System.out.println("Enter an integer value n: ");
    nvalue = keyboard.nextInt();
    keyboard.nextLine();

    compareValue(arr, nvalue);

    keyboard.close();
  }

  public static void compareValue(ArrayList<Integer> arr, int value) {
    Iterator<Integer> iterator = arr.iterator();
    while (iterator.hasNext()) {
      Integer index = iterator.next();
      if (index <= value) {
        iterator.remove();
      }
    }
    System.out.println("The new array is: " + arr);
  }
}