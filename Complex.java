public class Complex{
  private double realPart=0.0;
  private double imaginaryPart=0.0;
  public Complex(){ 
  }
  public Complex(double r,double i){
    realPart=r;
    imaginaryPart=i;
  }
  public Complex add(Complex otherNumber){
    Complex newComplex;
    double new1=realPart+otherNumber.realPart;
    double new2=imaginaryPart+otherNumber.imaginaryPart;
    newComplex = new Complex(new1, new2);
    return newComplex;
  }
  public Complex subtract (Complex otherNumber){
    Complex newComplex;
    double new1=realPart-otherNumber.realPart;
    double new2=imaginaryPart-otherNumber.imaginaryPart;
    newComplex = new Complex(new1, new2);
    return newComplex;
  }
  public Complex multiply (Complex otherNumber){
    Complex newComplex;
    double new1=realPart*otherNumber.realPart;
    double new2=imaginaryPart*otherNumber.imaginaryPart;
    newComplex = new Complex(new1, new2);
    return newComplex;
  }
  public Complex divide (Complex otherNumber){
    Complex newComplex;
    double new1=realPart/otherNumber.realPart;
    double new2=imaginaryPart/otherNumber.imaginaryPart;
    newComplex = new Complex(new1, new2);
    return newComplex;
  }
  public void setRealPart (double r){
    realPart=r;
  }
  public void setImaginaryPart (double i){
    imaginaryPart=i;
  }
  public double getRealPart(){
    return realPart;
  }
  public double getImaginaryPart(){
    return imaginaryPart;
  }
  public String toString(){
    double number=realPart+imaginaryPart;
    String numberAsString = Double.toString(number);
    return numberAsString;
  }
}