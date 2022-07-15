//Excercises 8.12  #5
import java.io.*;
import java.util.*;

public class Sieve{
  public static void main(String[] args){
    int counter = 0;
    for(boolean item: sieve(20)){
      System.out.println(counter + ": " +item);
      counter++;
     }
      
  }
  //takes an integer input.  and returns a boolean list that is true for prime number and false for non prime number up to n-1
  public static boolean[] sieve(int n){
    boolean[] nums = new boolean[n];
    for (int i=2; i<nums.length;i++){
      nums[i]=true;
    }
    // these nested for loops make each multiple of a prime number classified as "false", non-prime
    for(int i = 2; i<nums.length;i++){
      if (nums[i]){
        for(int j = i+1; j<nums.length; j++){
          if(j%i==0){
            nums[j]=false;
          }
        }
        
      }
    }
    return nums;

  }
}
