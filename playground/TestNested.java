import java.util.Scanner;

public class TestNested {
  public static void main(String[] args){
    
    int x, y, z;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Insert a value for x");
    x = keyboard.nextInt();
    System.out.print("Insert a value for y");
    y = keyboard.nextInt();

    if (x > 0) {
      if(y < 20) {
        z = 1;
        System.out.println("Y is less than 20, z is equal to 1");
      }
      else {
        z = 0;
        System.out.println("Y is not less than 20, z is equal to 0");
      }
    }
    else {
      System.out.println("x is not greater than 0");
    }
  }
}