/**
 * nth Fibonacci number generator by Room 5
 * Adam Prado
 * collaborators: Patti EW, Anand M
 */

public class Fib
{
  //your implementation of fib(n) here

public static int fibo (int x){
  if(x == 0 || x ==1){
    return 1;
  }
  else{
    return fibo(x-1) + fibo(x-2);
  }
}
  public static void main( String[] args )
  {
    System.out.println("6th thing in fibo seq" + fibo(6));
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      System.out.println( fib(0) ); // -> 0
      System.out.println( fib(1) ); // -> 1
      System.out.println( fib(2) ); // -> 1
      System.out.println( fib(3) ); // -> 2
      System.out.println( fib(4) ); // -> 3
      System.out.println( fib(5) ); // -> 5
      //now go big:
      System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main()

}//end class Fib