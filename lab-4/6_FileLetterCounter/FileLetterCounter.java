
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;

public class FileLetterCounter {
  public static void main(String[] args) throws IOException {

    String str, text, newStr, fileName, inputFileText;
    char character;
    int count = 0;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a file name: ");
    str = keyboard.nextLine();

    fileName = str + ".txt";

    // Create File with user input
    PrintWriter outputFile = new PrintWriter(fileName);

    // Add some text
    System.out.println("Enter some text into the file: ");
    text = keyboard.nextLine();

    // Close connection After injecting the text
    outputFile.println(text);
    outputFile.close();

    // Open the File
    File file = new File(fileName);
    Scanner inputFile = new Scanner(file);

    inputFileText = inputFile.nextLine();
    inputFile.close();

    System.out.println("Enter a character: ");
    character = keyboard.next().charAt(0);

    newStr = inputFileText.replaceAll("(\\W||\\D)", "").toLowerCase();
    System.out.println(newStr);

    for (int i = 0; i < newStr.length(); i++) {
      if (newStr.charAt(i) == character) {
        count++;
      }
    }
    System.out.printf("The character %s appears %d time in \"%s\" in the %s file.",
        character,
        count,
        inputFileText,
        fileName);

    keyboard.close();
  }
}