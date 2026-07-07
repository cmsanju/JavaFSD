package inh;

@FunctionalInterface
interface FunInf1{
  void greetUser();

  static  void greet(){
    System.out.println("greet");
  }

  default void display(){
    System.out.println("display");
  }

}

public class FunInfDemo {
  public static void main(String[] args) {

    FunInf1 obj = new FunInf1(){
      @Override
      public void greetUser(){
        System.out.println("greetUser");
      }
    };
    obj.greetUser();

    new FunInf1(){
      @Override
      public void greetUser(){
        System.out.println("greetUser");
      }
    }.greetUser();

    //lambda expression

    FunInf1 obj2 = () -> {
      System.out.println("obj2");

    };
    obj2.greetUser();
  }
}
