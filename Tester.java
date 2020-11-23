public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(0.25);
    RealNumber b = new RealNumber(2);
    System.out.println(a.equals(b));
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
  }
}
