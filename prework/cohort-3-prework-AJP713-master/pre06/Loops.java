//Chapter 7 Excercise 2,3,4

import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[] args){
      
    System.out.println(squareRoot(48.0));
    System.out.println(power(4.2,6));
    System.out.println(factorial(6));
  }
//Excercise 2
// This method takes a double input and finds the square root as a double, within an error of 0.0001
  public static double squareRoot(double x){
    double guess1 = x;
    double guess2 = x/2;
    
    while(Math.abs(guess1 - guess2)>0.0001){
      guess1 = guess2;
      guess2 = formula(x,guess2);
    }
    return guess2;
  }
  public static double formula(double num, double guess){
    return ((guess+(num/guess))/2);
  }

//Excercise 3
//This function takes a double and raises it to the power of an integer and returns that number
  public static double power(double x, int n){
    double product = x;
    for(int i = 1; i<n; i++){
      product = product * x;
    }
    return product;
  }

//Excercise 4
// The method takes an integer in and returns that number factorial  
  public static int factorial(int n){
    int product = n;
    for(int i = 1; i<n; i++){
      product = product*i;
    }
    return product;
  }
  
}