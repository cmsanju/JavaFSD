public class Exp5 {
  public static void main(String[] args) {

    //auto boxing
    int x = 100;
    Integer xx = new Integer(x);

    long j = 22333;

    Long jj =  new Long(j);

    //auto unboxing
    Long b = new Long(1);
    long bb = b;

    Double d = new Double(234.33);

    double dd = d;

    String v1 = String.valueOf(xx);

    int v2= Integer.parseInt(v1);

    int k = 200;

    long m = k;

    long n = 345;

    int o = (int)n;

    Object o5 = new Object();

    Exp5 obj = (Exp5) o5;
  }
}
