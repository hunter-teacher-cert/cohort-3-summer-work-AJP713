import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
      double cels, fahren;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Input a temperature in Celsius: ");
      cels = in.nextDouble();
      fahren = (cels *9/5 + 32);
      System.out.printf("%.1f Celsius = %.1f Fahrenheit\n",cels,fahren);
    }
}