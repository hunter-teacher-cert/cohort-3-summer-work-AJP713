/**
 * Recursive String Reverser by 6
 * Adam Prado
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    if(s.length() == 0){return s;}
    else{
      return s.substring(s.length() - 1) + reverseR(s.substring(0,s.length()-1)); //returns last string concatenated with reverseR with an input of all except for last character.  
      //example   ReverseR("ABCD") on first pass will return "D" + ReverseR("ABC") and so on
    }
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}


//String s="hello";    
//System.out.println(s.substring(0,2)); //returns he  as a substring  