package excp;

import java.util.Scanner;

public class SalaryDemo{
  public static void main(String[] args)//throws SalaryException
  {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter Salary:");
   double salary = sc.nextDouble();

   SalaryValidation sv = new SalaryValidation();
try {
  sv.checkSalary(salary);
}
catch(SalaryException ex)
{
  System.out.println(ex.getMessage());
}

  }
}
