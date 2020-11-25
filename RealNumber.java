public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  
  public RealNumber add(RealNumber other){
     double a = getValue() + other.getValue();
     RealNumber hi = new RealNumber(a);
     return hi;
  }
  public RealNumber multiply(RealNumber other){
     double a = getValue() * other.getValue();
     RealNumber hi = new RealNumber(a);
     return hi;
   }
   public RealNumber divide(RealNumber other){
      double a = getValue() / other.getValue();
      RealNumber hi = new RealNumber(a);
      return hi;
    }
    public RealNumber subtract(RealNumber other){
       double a = getValue() - other.getValue();
       RealNumber hi = new RealNumber(a);
       return hi;
     }

}
