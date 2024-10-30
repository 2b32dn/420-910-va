public class Triangle {
  public static void main(String args[]) {
    int num = 6;

    // Variables for No Nested Loop Method
    // String emptySpace = " ", emptySpaceFilled;

    System.out.println("*");
    for (int i = 0; i < num; i++) {

      // No Nested Loop Method
      // emptySpaceFilled = emptySpace.repeat(i);
      // System.out.printf("*%s* \n", emptySpaceFilled);

      // Nested Loop Method
      System.out.print("*");
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}