
/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {
    //cut/paste this leading comment bar down, one line at a time, as you test...

      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );
      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );
      Rational x = new Rational( 8, 12 );
      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );

      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );

      System.out.print( r + " * " + t + " = ");  
      r.multiply(t);
      System.out.println(r);
      r = new Rational( 3, 7 );
    
      System.out.print( r + " / " + t + " = ");
      r.divide(t);

      r = new Rational( 3, 7 );
      t = new Rational( 0, 7 );
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);
      System.out.println();
      System.out.println("x starts as " + x);
      x.simplify();
      System.out.println("x simplified is: " +  x );
      System.out.println();
      x = new Rational( 42  , 36);
      System.out.println("x starts as " + x);
      x.simplify();
      System.out.println("x simplified is: " +  x );

      System.out.println();
      
      x = new Rational( 2  , 4);
      w = new Rational( 3  , 6);
      System.out.println("Is "+ w + " equal to " + x);
      System.out.println(x.equals(w));
    //checking addition
      System.out.println();
      x = new Rational( 1  , 3);
      w = new Rational( 1  , 3);
      System.out.print( w + " + " + x + " = ");
      w.add(x);
      System.out.println(w);
  }

}//end class