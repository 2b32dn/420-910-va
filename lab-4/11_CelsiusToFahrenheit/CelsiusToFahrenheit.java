public class CelsiusToFahrenheit {

  public static void main(String[] args) {
    for (float celsius = 0; celsius <= 20; celsius++) {
      float fahrenheit = (float) (1.8 * celsius) + 32;
      System.out.printf("%2.0f°C is equal to %.1fF \n", celsius, fahrenheit);
    }
  }
}