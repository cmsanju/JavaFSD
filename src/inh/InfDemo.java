package inh;

interface Inf1 {

  float pi = 3.14f;

  void display1();

  static  void display5()
  {
    System.out.println("display5");
  }

  default  void display6()
  {
    System.out.println("display6");
  }
}
interface Inf2 {
  void display2();
}
interface Inf3 {
  void display3();
}

abstract class Abs {
 public Abs()
 {

 }
  public void cat() {
    System.out.println("cat");
  }
  public abstract void dog();
}

class Impl1 extends Abs implements Inf1, Inf2, Inf3 {
  @Override
  public void dog() {
    System.out.println("dog");
  }
  @Override
  public void display1() {
    System.out.println("display1");
  }

  @Override
  public void display2() {
    System.out.println("display2");
  }
  @Override
  public void display3() {
    System.out.println("display3");
  }
}

public class InfDemo {
  public static void main(String[] args) {

    Impl1 inf1 = new Impl1();
    inf1.display1();
    inf1.display2();
    inf1.display3();
    inf1.cat();
    inf1.dog();
  }
}
