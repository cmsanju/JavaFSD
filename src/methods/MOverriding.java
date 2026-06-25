package methods;

public class MOverriding {

  public void draw()
  {
    System.out.println("circle");
  }

}

class Shapes extends MOverriding {
  @Override
  public void draw()
  {
    System.out.println("square");

  }

  public static void main(String[] args) {
    Shapes obj = new Shapes();
    obj.draw();
  }
}
