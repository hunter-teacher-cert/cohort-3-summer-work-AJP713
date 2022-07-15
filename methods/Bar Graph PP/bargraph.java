import java.io.*;
import java.util.*;
public class bargraph {

  public static void barGraphify(int[] nums){//testing static
      for(int i=0; i<nums.length; i++){
        System.out.print(i + ": ");
        for( int j=0; j<nums[i]; j++){
          System.out.print("=");
      }
      System.out.println();
    }
  }

  
public static String barGraphtString(int[] nums){
  String output = "";
     for(int i=0; i<nums.length; i++){
        output += (i + ": ");
        for( int j=0; j<nums[i]; j++){
          output += ("=");
      }
      output += "\n" ;
    }
  return output;
}
  
public static String vBargraphify(int[] nums){
  int max = nums[0];
  String output = "";
  for(int i = 0; i<nums.length; i++){
    if (nums[i]>max){
      max = nums[i];
    }
  }
  for(int i = max; i>0; i--){  //assuming an MONO font
    for(int j = 0; j<nums.length; j ++){
      if(nums[j]>=i){
        output += "*";
      }else{
        output += " ";  //TODO change to space once su
      }
    }
    output += "\n" ;
  }
  for(int x = 0; x<nums.length; x++){
    output += x;
  }
  return output;
}

  
  public static void main (String [] arg){ //testing static
    int[] test1 = {1,0,3,2};
    int[] test2 = {5,0,1,2};
    // barGraphify(test1);
    //  System.out.println();
    //  barGraphify(test2);
    //System.out.println(barGraphtString(test1));
    //System.out.println(barGraphtString(test2));
   // System.out.println(vBargraphify(test1));
    System.out.println(vBargraphify(test1));
    System.out.println();
    System.out.println(vBargraphify(test2));

    
    
    // for(int i=0; i<test2.length; i++){
    //   System.out.print(i + ": ");
    //   for( int j=0; j<test2[i]; j++){
    //     System.out.print("=");
    //   }
    //   System.out.println();
    // }
    
  }

}