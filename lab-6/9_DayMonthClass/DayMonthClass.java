import java.util.*;

class MonthDays {
  private int month;
  private int year;

  public MonthDays(int month, int year) {
    this.month = month;
    this.year = year;
  }

  // Setters
  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Accessors (Getters)
  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  // Mutators
  public int getNumberOfDays(int year, int month) {
    switch (month) {
      case 1:
        return 31;
      case 2:
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
          return 29;
        } else {
          return 28;
        }
      case 3:
        return 31;
      case 4:
        return 30;
      case 5:
        return 31;
      case 6:
        return 30;
      case 7:
        return 31;
      case 8:
        return 31;
      case 9:
        return 30;
      case 10:
        return 31;
      case 11:
        return 30;
      case 12:
        return 31;
      default:
        return 0;
    }
  }
}

public class DayMonthClass {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a month (1-12): ");
    int month = keyboard.nextInt();
    System.out.println("Enter a year: ");
    int year = keyboard.nextInt();

    MonthDays monthDays = new MonthDays(year, month);

    int days = monthDays.getNumberOfDays(year, month);

    System.out.println(days + " days");
    keyboard.close();
  }
}