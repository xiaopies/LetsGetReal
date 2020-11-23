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
    double avg = (getValue()+ other.getValue())/2.0;
    return (Math.abs((this.getValue() - other.getValue())/avg) <= 0.00001);
  }
}
