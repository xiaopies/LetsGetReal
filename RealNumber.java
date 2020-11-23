public class RealNumber{
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
  public boolean equals(RealNumber other){
    if (getValue()==0 || other.getValue()==0){
      return (getValue()==0 && other.getValue()==0);
    }
    double avg = (getValue()+ other.getValue())/2.0;
    return (Math.abs((this.getValue() - other.getValue())/avg) <= 0.00001);
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
