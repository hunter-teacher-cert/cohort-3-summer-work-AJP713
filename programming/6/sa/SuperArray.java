/**
 * SuperArray by Team Room 8
Adam Prado, Jessca Novillo Argudo, Qianhui Vanessa Zou, Maxwell Yearwood
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */
    data= new int[size] ;
    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
      data= new int[10] ;
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
      numberElements = 0;
    
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */

    if (data.length == numberElements){
      grow();
    }
    data[numberElements] = value;
    numberElements ++;
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */


    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    return numberElements==0;
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    String str = "";
    for(int i=0; i<numberElements; i++){
      str += data[i] + ", ";
    }
    return str;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    for(int i=index; i<numberElements -1; i++){
      data[i]=data[i+1];
    }
    // subtract fom numElements;
    data[numberElements-1]=0;
    numberElements -- ;
    /* YOUR SIMPLE+SMART CODE HERE */
  }

  public void set(int index, int value){

    if(index<=numberElements && index>=0){
      data[index]=value;
    }else{
      System.out.println("Out of range! Index is larger than list, did not add element to list");
    }
    
    
  }

  public void add(int index, int value)
  {

  if(index == numberElements && index>=0){
           // see if there's enough room
        /* YOUR SIMPLE+SMART CODE HERE */
        if (data.length == numberElements){
          grow();
        }
        // shift elements toward the end of the array
        /* YOUR SIMPLE+SMART CODE HERE */
       for(int i=numberElements;i>index;i--){
         data[i]=data[i-1];
       }
        // insert new element
        /* YOUR SIMPLE+SMART CODE HERE */
        data[index] = value;
        // increment numElements
        /* YOUR SIMPLE+SMART CODE HERE */
        numberElements ++;
      }else{
      System.out.println("Out of range! Index is larger than list, did not add element to list");
    }
   
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    int[] dataNew = new int[numberElements+5];
    
    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */
  for(int i=0; i<data.length; i++){
    dataNew[i] = data[i];
  }
    
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = dataNew;
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class