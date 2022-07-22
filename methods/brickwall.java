import java.io.*;
import java.util.*;

public class brickwall{
  public static void main(String[] args){    
    // Here is an example of a wall that is 3 bricks across and 6 bricks tall.  
    System.out.println("This is what a wall with inputs of 3 (width) and 6 (height) should look like")
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    
// Overall Goal: make a method that takes 2 integer inputs (bricks wide and bricks tall) and draws a similar character image. 
//Advanced: takes a 3rd input for how wide each brick is.  

//Tests, uncomment each as you go
//System.out.println("The line below should print a row of 5 full bricks");
//System.out.println(fullRow(5));  
//System.out.println("The line below should print a row starting with a half brick, then 3 full bricks then a half brick");
    //System.out.println(otherRow(4));
    //System.out.println(wall(6,3));
    //
      //1st Create code for a string to represent a full brick or a half a brick.  Look at the example above.  
    
 
  
  }  

  //Create a method to draw a row of full bricks with a given number of 
    public static String fullRow(int bricksWide){
      return "something"; //change that
    }
  

       
      //System.out.println(fullRow(5));
      //Create a row of bricks that starts with a partial (half-brick)
    public static String otherRow(int bricksWide){
      return "something"; // change that
    }
      //Create a method that alternately stack the two types of row 
public static String wall(int rowsTall, int brickwidth){
    return "something"; // change that
}
      
      


}