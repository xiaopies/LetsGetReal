public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno ==0){
      numerator = 0;
      denominator = 1;
    }
    if (deno<0){
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
  }
  public double getValue(){
    double n = numerator;
    return n/denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    RationalNumber a= new RationalNumber(getDenominator(), getNumerator());
    return a;
  }
  public boolean equals(RationalNumber other){
    return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());
  }
  public String toString(){
    return numerator + "/" + denominator;
  }

}
