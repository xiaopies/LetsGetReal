public abstract class Number{
  public abstract double getValue();


  public int compareTo(Number other){
    double a = getValue() - other.getValue();
    int b = (int) a;
    return b;
  }

  public boolean equals(Number other){
    if (getValue()==0 || other.getValue()==0){
      return (getValue()==0 && other.getValue()==0);
    }
    double avg = (getValue()+ other.getValue())/2.0;
    return (Math.abs((this.getValue() - other.getValue())/avg) <= 0.00001);
  }
}
