
import java.util.Scanner;
import java.io.*;

public class FileConverterUppercase {
  public static void main(String[] args) throws IOException {

    String str, secondStr, text, fileName, secondFileName, inputFileText;

    Scanner keyboard = new Scanner(System.in);

    // First File Name
    System.out.println("Enter first file name: ");
    str = keyboard.nextLine();
    fileName = str + ".txt";

    // Second File Name
    System.out.println("Enter second file name: ");
    secondStr = keyboard.nextLine();
    secondFileName = secondStr + ".txt";

    // Create both file with user input
    PrintWriter outputFile = new PrintWriter(fileName);
    PrintWriter secondOutputFile = new PrintWriter(secondFileName);

    // Add some text
    System.out.println("Enter some text into the first file: ");
    text = keyboard.nextLine();

    // Close connection After injecting the text
    outputFile.println(text);
    outputFile.close();

    File file = new File(fileName);
    Scanner inputFile = new Scanner(file);
    inputFileText = inputFile.nextLine();
    inputFile.close();

    secondOutputFile.println(inputFileText.toUpperCase());
    secondOutputFile.close();

    keyboard.close();
  }
}