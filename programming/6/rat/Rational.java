/**
 * Rational class by Team BangPi
 * Qianhui Vanessa Zou
 * collaborators: Adam Prado, Jessica Novillo Argudo, Maxwell Yearwood
 */



/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    /* YOUR ELEGANT CODE HERE */
    _numerator = n;
    if(d != 0){
      _denominator = d;
    } else {
      System.out.println("invalid denominator setting to 0/1");
      
      _numerator = 0;  //TODO try this with Rational() 
      _denominator = 1;
    }
    
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */
    return(_numerator + "/" + _denominator);
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)_numerator/_denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator *= r._numerator;
    _denominator *= r._denominator;
    
  }

 public void divide( Rational r )
  { 
    if(r._numerator==0){
      System.out.println("Invalid, cannot divide by 0");
    }else{
    _numerator *= r._denominator;
    _denominator *= r._numerator;
    }
  }
 

 //AKA reduce()
  //this simplifies a fraction by finding the GCF of the num and den and then dividing both by that value, if no GCF nothing changes
  //no return, just changes the original Rational Number
 public void simplify(){
     for(int x=_numerator; x>1; x--){ //checks for GCF starting at num and going down to 1, will find the largest GCF
       
        if(_numerator%x==0 && _denominator%x==0){ //this checks for divisibility of the same factor in both 
          //System.out.println("Is divisible by "+ x);
          _numerator /= x;
          _denominator /= x;
        }
     }
 }

  //this checks if two fractions are equal and then returns true if they are and false if they do now.  Will work for equivalent fractions (1/2)==(2/4)
 public boolean equals( Rational other ){
   other.simplify();
   this.simplify();
   return (_numerator == other._numerator &&
          _denominator == other._denominator);
 }

public void add(Rational r ){
  int newNum = (this._numerator*r._denominator)+(r._numerator*this._denominator);
  int newDen = (this._denominator*r._denominator);
  this._numerator = newNum;
  this._denominator=newDen;
  this.simplify();
}

}//end class