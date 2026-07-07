package inh;

interface Inf6
{
  void add();

  interface Inf7
  {
    void sub();
  }
}

class Impl6 implements Inf6.Inf7
{
  @Override
  public void sub()
  {
    System.out.println("sub");
  }

}

public class InnerInfDemo {
  public static void main(String[] args) {

    Impl6 impl = new Impl6();

    impl.sub();
  }
}
