package inh;


interface FunInf2
{
  String userDetails(String name);
}

public class FunInfDemo1 {
  public static void main(String[] args) {

    FunInf2 obj = (String name) -> {
      System.out.println("Hello " + name);
      return "Hello Hi..." + name;
    };
    System.out.println(obj.userDetails("RK"));
  }
}

