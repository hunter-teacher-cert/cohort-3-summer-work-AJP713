/**
 * Recursion Practice with Strings by room 5
 * Adam Prado
 * collaborators: Patti EW, Anand M
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
    if(n == 1 || n==0) {return "|";}
    else{
      return fenceR (n-1) + "--|";   }
    
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
  }
  
  

  public static void main( String[] args )
  {

    for( int i = 1; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}