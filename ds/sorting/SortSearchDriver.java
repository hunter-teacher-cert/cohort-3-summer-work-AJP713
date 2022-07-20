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
  System.out.println("\nPrint results when started at index 0 in the array:\nss[smallestIndex] = value : data");
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(10);
  System.out.println("\nPrint results when started at index 3 in the array:\nss[smallestIndex] = value : data");
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3
  System.out.println("\nPrint array:");
	System.out.println(ss);
  System.out.println("\nPrint sorted array:");
	ss.sort();
	System.out.println(ss);
	


	      

    }
}