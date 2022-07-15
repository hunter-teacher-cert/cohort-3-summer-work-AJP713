//Excercise 8.12  #4
//The enhanced for loop is not ideal for this situation because you need the index of the element.  It is easier to use a regular for loop that keeps track of index #.
import java.io.*;
import java.util.*;

public class Max{
    public static void main(String[] args){
        int[] test = new int[3];
        test[0] = 235;
        test[1] = 33;
        test[2] = 11;

      System.out.println(indexOfMax(test));
    }
  //
  public static int indexOfMax(int[] intList){
    int max = intList[0];
    int indexMax = 0;
    for(int i = 0; i<intList.length; i++){
      if(intList[i]>max){
        indexMax = i;
        max = intList[i];
      }
    }
    return indexMax;
  }
}
