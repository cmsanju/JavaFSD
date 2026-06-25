package methods;

import java.util.Scanner;

class Employee
{
  private int id;
  private String name;
  private float salary;

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setSalary(float salary) {
    this.salary = salary;
  }
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public float getSalary() {
    return salary;
  }
}

public class EncapExp {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter Employee ID: ");
    int id = in.nextInt();
    System.out.print("Enter Employee Name: ");
    String name = in.next();
    System.out.print("Enter Employee Salary: ");
    float salary = in.nextFloat();

    Employee emp = new Employee();
    emp.setId(id);
    emp.setName(name);
    emp.setSalary(salary);

    System.out.println("EMP ID : "+emp.getId());
    System.out.println("EMP NAME :"+emp.getName());
    System.out.println("EMP SALARY : "+emp.getSalary());
  }
}
