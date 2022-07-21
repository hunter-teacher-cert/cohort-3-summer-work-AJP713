import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

  System.out.println();
      
	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3
  System.out.println();
      
      
	System.out.println(ss);
	ss.sort();
  
	System.out.println(ss);

    System.out.println("Linear search found value 5 at index " + ss.linearSearch(5));

    System.out.println("Binary search found value 5 at index " + ss.binarySearch(5));

      System.out.println("Binary search found value 35 at index " + ss.binarySearch(35));

      System.out.println("Recursive Bin Search found value 5 at index " + ss.binarySearchRecursive(5, 0, ss.size()-1));

            System.out.println("Recursive Bin Search found value 35 at index " + ss.binarySearchRecursive(35, 0, ss.size()-1));


    int size = 1000;

    long start,elapsed;
	  start = System.currentTimeMillis();
	    // put what you want to test here!
    SortSearch test = new SortSearch(size);
     //System.out.println(test); 
    test.sort();
     // System.out.println(test); 
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);

     size = 1000;

    
	  start = System.currentTimeMillis();
	    // put what you want to test here!
    SortSearch test2 = new SortSearch(size);
     //System.out.println(test); 
    test2.sort();
     // System.out.println(test); 
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);

      
    }
}