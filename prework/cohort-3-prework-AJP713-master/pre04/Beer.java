import java.io.*;
import java.util.*;

public class Beer {
    public static void main(String[] args){
      verse(99);
        
    }
    public static void verse(int n){
      if(n > 0){ // TODO make it say 1 bottle instead of 1 bottles.
          System.out.println(n + " bottles of beer on the wall");
          System.out.println(n + " bottles of beer");
          System.out.println("ya' take ond down, ya' pass it around,\n"+ (n-1) + " bottles of beer on the wall.");
          verse(n - 1);
        }else{
      System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya' can't take one down, ya' can't pass it around,\n'cause there are no more bottles of beer on the wall");
        }
    }
  
}