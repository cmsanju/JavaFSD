package excp;

public class SalaryValidation {
      public void checkSalary(double salary)throws SalaryException
    {
      if(salary < 0)
      {
        throw(new SalaryException("Salary is negative"));
      }
      else
      {
        throw(new SalaryException("Salary is valid"));
      }
    }
}
