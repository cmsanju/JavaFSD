public class Exp1 {

  public static void main(String[] args)
  {
    int[] arr = {10,20,30,40,50};
/*
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);

    //System.out.println(arr[5]);

 */
//10
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }

    for(int x : arr)
    {
      System.out.println(x);
    }

    String name = "java";

    System.out.println(name.charAt(3));
    System.out.print(name.charAt(4));

  }
}
