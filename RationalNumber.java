public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno==0){
      numerator = 0;
      denominator = 1;
    }
    if (deno<0){
      numerator = nume * -1;
      denominator = deno * -1;
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
  private static int gcd(int a, int b){
    int x = Math.max(a, b);
    int y = Math.min(a, b);
    int r = a;
    while (r !=0){
      r = x % y;
      x = y;
      y = r;
    }
    return x;
  }
  private void reduce(){
    int a = gcd(numerator, denominator);
    numerator = numerator/a;
    denominator = denominator/a;
    if (getDenominator()==0){
      numerator = 0;
      denominator = 1;
    }
    if (getDenominator()<0){
      numerator *= -1;
      denominator *= -1;
    }
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber m = new RationalNumber(getNumerator()*other.getNumerator(), getDenominator() * other.getDenominator());
    m.reduce();
    return m;
  }
  public RationalNumber divide(RationalNumber other){
    RationalNumber m = new RationalNumber(getNumerator()*other.getDenominator(), getDenominator() * other.getNumerator());
    m.reduce();
    return m;
  }
  public RationalNumber add(RationalNumber other){
    int nome= getNumerator() * other.getDenominator();
    int nwo= other.getNumerator() * getDenominator();
    RationalNumber a= new RationalNumber( nome + nwo, other.getDenominator() * getDenominator());
    a.reduce();
    return a;
  }
  public RationalNumber subtract(RationalNumber other){
    int nome= getNumerator() * other.getDenominator();
    int nwo= other.getNumerator() * getDenominator();
    int bottom = other.getDenominator() * getDenominator();
    RationalNumber a= new RationalNumber( nome-nwo, bottom);
    a.reduce();

    return a;
  }



}
