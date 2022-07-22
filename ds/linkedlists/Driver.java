
import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("first");
    l.add("second");
    l.add("next");
    l.add("last");
    l.add("other one");
    l.add(0, "Test");
    
    
    System.out.println(l);

    System.out.println(l.size());

    System.out.println(l.get(0));
    System.out.println(l.get(2));
    System.out.println(l.get(4));
    System.out.println(l.indexOf("Check"));
//this is a test so we can see the array
  String[] l_array = l.toArray();
   System.out.print(l_array[0]);
    for(int i=1; i<l_array.length;i++){
    
      System.out.print(", " + l_array[i]);
  }
  System.out.println();
  }
  
}