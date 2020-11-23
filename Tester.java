public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(0.25);
    RealNumber b = new RealNumber(2);
    System.out.println(a.equals(b));
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
    System.out.println(a.subtract(b));
    RationalNumber c = new RationalNumber(1, 2);
    RationalNumber d = new RationalNumber(2, 1);
    RationalNumber e = d.reciprocal();
    System.out.println(c.getValue());
    System.out.println(c.getNumerator());
    System.out.println(c.getDenominator());
    System.out.println(c.reciprocal());
    System.out.println(c.equals(e));
    System.out.println(c.toString());
    System.out.println(c);
    RationalNumber f = new RationalNumber(36, 72);
    System.out.println(f);
    f.reduce();
    System.out.println(f);
  }
}
