/**
 * nth Fibonacci number generator by Room 5
 * Adam Prado
 * collaborators: Patti EW, Anand M
 */

public class Fib
{
  //your implementation of fib(n) here

public static int fib (int x){
  if(x == 0 || x== 1){
    return x;
  }else{
    return fib(x-1) + fib(x-2);
  }
}
  public static void main( String[] args )
  {
    for(int i =0; i<11; i++){
       System.out.println(i +" element in fibo seq --> " + fib(i));
    }
    
      // System.out.println( fib(0) ); // -> 0
      // System.out.println( fib(1) ); // -> 1
      // System.out.println( fib(2) ); // -> 1
      // System.out.println( fib(3) ); // -> 2
      // System.out.println( fib(4) ); // -> 3
      // System.out.println( fib(5) ); // -> 5
      // //now go big:
      // System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155
      

  }//end main()

}//end class Fib