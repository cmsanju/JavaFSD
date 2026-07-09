package excp;

public class Exp1 {
  public static void main(String[] args) {

   try{

     System.out.println(100/5);

     int x = Integer.parseInt("111");
     System.out.println(x);

     String str = "java";

     System.out.println(str.charAt(1));
   }
   catch (ArithmeticException ae){
     System.out.println("can't divide by zero");
   }
   catch(NullPointerException npe){

     System.out.println("enter string input");
   }
   catch (StringIndexOutOfBoundsException se){
     System.out.println("check string length");
   }
   catch(NumberFormatException e){
     System.out.println("check your input number");
   }
   catch(Exception e)
   {
     System.out.println("check your inputs");
     //System.exit(0);
   }

   finally{
     System.out.println("finally");

   }

  }
}
