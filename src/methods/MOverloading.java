package methods;

public class MOverloading {

  public void testMethod(int x, float y) {

    System.out.println("double arg int float");
  }

  public void testMethod(int x, int y) {
    System.out.println("double arg int ");
  }

  public void testMethod(int x) {
    System.out.println("single arg int ");
  }

  public static void main(String[] args) {

    MOverloading obj = new MOverloading();

    obj.testMethod(1, 33);
    obj.testMethod(19, 3.4f);
    obj.testMethod(25);
  }

}
