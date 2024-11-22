public class EmployeeClass {

  public static void main(String[] args) {
    Employee susanMeyers = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
    Employee markJones = new Employee("Mark Jones", 39119, "IT", "Programmer");
    Employee marshallMathers = new Employee("Eminem", 81774, "Music", "Rapper / CEO");
    Employee dicksonLee = new Employee("Dickson Lee", 42069, "IT", "l337 m3m3 l0rD");

    System.out.printf("%1s%25s%20s%20s\n", "Name", "ID Number", "Department", "Position");
    System.out.println("----------------------------------------------------------------------------");
    System.out.printf("%1s%15s%22s%26s\n", susanMeyers.getName(), susanMeyers.getIdNumber(),
        susanMeyers.getDepartment(), susanMeyers.getPosition());
    System.out.printf("%1s%17s%14s%30s\n", markJones.getName(), markJones.getIdNumber(),
        markJones.getDepartment(), markJones.getPosition());
    System.out.printf("%1s%21s%17s%29s\n", marshallMathers.getName(), marshallMathers.getIdNumber(),
        marshallMathers.getDepartment(), marshallMathers.getPosition());
    System.out.printf("%1s%16s%14s%32s\n", dicksonLee.getName(), dicksonLee.getIdNumber(),
        dicksonLee.getDepartment(), dicksonLee.getPosition());
  }
}

class Employee {
  private String name;
  private int idNumber;
  private String department;
  private String position;

  // Constructor (Same name as the class)
  public Employee(String name, int idNumber, String department, String position) {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  // Acessors (Getters)
  public String getName() {
    return name;
  }

  public int getIdNumber() {
    return idNumber;
  }

  public String getDepartment() {
    return department;
  }

  public String getPosition() {
    return position;
  }

}