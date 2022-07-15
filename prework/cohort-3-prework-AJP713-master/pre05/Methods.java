import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){

    System.out.println("Divisibility Checks");
      System.out.println(isDivisible(77,11)); 
      System.out.println(isDivisible(75,11)); 

    System.out.println("isTriangle Check");
      System.out.println(isTriangle(4,5,6));
      System.out.println(isTriangle(44,5,6));
      System.out.println(isTriangle(4,55,6));
      System.out.println(isTriangle(4,5,66));

    System.out.println("ackerman function check");
      System.out.println(ack(3,2));
      System.out.println(ack(3,3));
  }

  //checks if one number is divisible by another returns true if it is and false if not
  public static boolean isDivisible(int n, int m){
    if(n % m == 0){
      return true;
    }else{
      return false;
    }
    
  }
  
  // takes 3 integer inputs and checks if they could make a triangle.  returns true or false if it they can. g
  public static boolean isTriangle(int a, int b, int c){
    if(a>(b+c) || b>(a+c) ||c>(a+b)){
      return false;
    }else{
      return true;
    }
  }

  //ackerman function, takes two integer inputs (hopefully small) and does some convoluded process with them ;)
  public static int ack(int m, int n){
    if(m == 0){
      return n+1;
    }else if(m >0 && n==0){
      return ack(m-1,1);
    }else{
      return ack(m-1,ack(m,n-1));
    }
  }

  
}