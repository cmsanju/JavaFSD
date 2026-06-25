class Customer
{
  public Customer()
  {
    System.out.println("Default constructor");
  }

  public  Customer(int id, String name){

    System.out.println("parameterised constructor");
    System.out.println("id: "+id+" name: "+name);
  }

  public  Customer(int id){
    System.out.println("parameterised constructor int");
  }

  public   Customer(String name ){
    System.out.println("parameterised constructor String");
  }

  public  Customer(Customer c){
    System.out.println("parameterised constructor Customer");
  }

}

public class ConstDemo {

  public static void main(String[] args) {

    Customer c1 = new Customer();
    Customer c2 = new Customer("test");
    Customer c3 = new Customer(22);
    Customer c4 = new Customer(33, "RK");
    Customer c5 = new Customer(c1);


  }

}
