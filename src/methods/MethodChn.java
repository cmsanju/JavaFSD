package methods;

class Order
{
  //factory method
  public Order getObject()
  {
    //Order o = new Order();

    System.out.println("getObject");

    return new Order();
  }

  public void order1()
  {
    System.out.println("order1");
    order2();
  }

  public void order2()
  {
    System.out.println("order2");
    order3();
  }
  public void order3()
  {
    System.out.println("order3");
  }
}

public class MethodChn {
  public static void main(String[] args) {

    Order o = new Order();
    o.order1();

    Order o2 = o.getObject();

    //using clone() method
    //Class.forName("Class name");
  }
}
