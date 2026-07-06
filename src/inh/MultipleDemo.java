package inh;

class D
{
  public void draw()
  {
    System.out.println("circle");
  }
}

class E  extends D
{
  @Override
  public void draw()
  {
    System.out.println("square");
  }

}

class F extends D
{
  @Override
  public void draw()
  {
    System.out.println("rectangle");
  }
}

public class MultipleDemo {
  public static void main(String[] args) {

    D  e = new E();//dynamic binding
    e.draw();
    D f = new F();
    f.draw();


  }
}
