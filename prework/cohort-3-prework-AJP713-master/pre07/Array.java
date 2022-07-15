import java.io.*;
import java.util.*;

public class Array{
    public static void main(String[] args){
      
        double[] test = new double[3];
        test[0] = 3.3;
        test[1] = 5.3;
        test[2] = 1.3;
        System.out.println(powArray(test,2)[0]);
        System.out.println(powArray(test,2)[1]);
        System.out.println(powArray(test,2)[2]);
    }
  //takes an array and raises all elements to the power. 
  public static double[] powArray(double[] a, int expo){
    double[] expoList = new double[a.length];
    for(int i=0; i< a.length; i++){
      expoList[i]=Math.pow(a[i],expo);
    }
    return expoList;
  }


}
