package inh;

class A{

  int id = 11;
  String name = "Java";
  public void show(){
    System.out.println("PARENT");
  }
}

class B extends A{

  String city = "ABCD";

  public void display(){
    System.out.println("Details ");
    System.out.println(id+" "+" "+name+" "+city);
  }
}

class C extends B{
  String state = "AP";

  public void details(){
    System.out.println("Details ");
    System.out.println(id+" "+" "+name+" "+city+" "+state);
  }
}

public class SingleDemo {

 public static void main(String[] args) {
/*
   B b = new B();
   b.show();
   b.display();

 */
   C c = new C();
   c.details();
   c.display();
   c.show();
 }
}
