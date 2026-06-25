class Book
{
    int id;
    String name;

  public  Book()
  {
    System.out.println("Default Constructor");//4
  }

    public Book(int id, String name)
    {
      this(12);
      this.id = id;
      this.name = name;
      System.out.println("args Constructor");//6
    }
    public Book(int id)
    {
      this.id = id;
      System.out.println("args Constructor int");
    }
  {
    System.out.println("instance block");//3/5
  }

  static
  {
    System.out.println("static block");//2
  }
}

public class ConstExp2 {
  public static void main(String[] args) {

    System.out.println("Main method");//1

    Book b1 = new Book();//

    Book b2 = new Book(101,"Test");


  }
}
