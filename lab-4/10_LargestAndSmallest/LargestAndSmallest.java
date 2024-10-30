import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {

		int value, smallest, largest = 0;

		Scanner keyboard = new Scanner(System.in);

    System.out.println("Type -99 to exit the game otherwise..");
		System.out.println("Enter a number: ");
		value = keyboard.nextInt();
    keyboard.nextLine();

		smallest = value;

		while (value != -99) {

			System.out.println("Enter a number: ");
			value = keyboard.nextInt();
      keyboard.nextLine();
		
			if(value != -99) {
        if (value > smallest) {
          largest = value;
        } else {
          smallest = value;
        }
      }
		}

		System.out.printf("Smallest Value: %d, Largest Value: %d", smallest, largest);
    keyboard.close();
	}
}