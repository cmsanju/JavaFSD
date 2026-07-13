package excp;

public class Exp2 {
  public  static void main(String[] args)
  {
    try{

      System.out.println("Hello World");

      System.out.println(11/5);

      System.out.println("Hello World");


    }catch (Exception e)
    {
      System.out.println(e.getMessage());
      System.out.println(e);
      e.printStackTrace();
    }
  }
}
