/**
 * SuperArrayDriver by Team Room 8
Adam Prado, Jessca Novillo Argudo, Qianhui Vanessa Zou, Maxwell Yearwood
 */
import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {

    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();
    System.out.println("Testing empty print:");
    System.out.println(sa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());
     for (int i=0; i<15; i++) {
      sa.add(i);
    }
    System.out.println(sa);
    System.out.println("test get at index 5: "+ sa.get(5));
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    System.out.println("\nTesting set 55 at index 2000, (error)");
    sa.set(2000,55);
    System.out.println("\nTesting adding 55 at index 2000, (error)");
    sa.add(2000, 55);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);  
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.remove(15);
    System.out.println(sa);
    sa.set(2,99);
    System.out.println(sa);
    System.out.println(sa.debug());
    
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.remove(15);
    System.out.println(sa);
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver