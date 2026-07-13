package excp;

import java.util.Scanner;

public class DistanceDemo {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the distance : ");
    String distance = sc.next();

    DistanceValidation dv = new DistanceValidation();

    dv.checkDistance(distance);

  }
}
