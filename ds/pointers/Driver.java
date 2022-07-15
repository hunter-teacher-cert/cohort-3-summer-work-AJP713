import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {
	// Fist:
	// Start here and trace through
	// the code by hand until the comment
	// that says stop tracing
	Node front;
	front = new Node("one");
      //creates new node called front referred to as new none with value of "one"
	front.setNext(new Node("two"));
      //front references "one" -.next one will look to new Node "two" 
	front.getNext().setNext(new Node("three"));
      //get will retrieve second one and then set to new node (empty space ) to "three"
	front.getNext().getNext().setNext(new Node("four"));
      //retrieves third one and sets to new node "four"
	System.out.println(front.getData());
      //give number that is in the value of "one"
	Node walker;
      //creates a new node walker.like front.
	walker = front;
      //new pointer to walker = front,will run like front
	System.out.println(front.getData());
      //prints out same as front "one"
	walker = walker.getNext();
      //skips first node - walker points to 2nd node in front "two"
      
	System.out.println(walker.getData());
      //printes out "two"
	System.out.println(front.getNext().getData());
  //prints out "two"
    
	// stop tracing
	// Now, compile and run the program
	// using "javac Driver.java Node.java"
	// and then "java Driver"
	// Once you've run,
	// complete the program as per the following comments
	// and compile and run your program again.

	// Add a line to set a new Node type
	// variable named walker to the same node as
	// the variable front points to
	// Add a line to set the walker variable defined above
	// so that it points to (refers to) the same node as
	// the variable front points to.

	// Uncomment the next line, compile and run
	// to test what you just added
	//System.out.println(walker.getData());
	    walker = front;
      while(walker.getNext() != null)
      {
      System.out.println(walker.getData());
        
        walker = walker.getNext();
      }      
      System.out.println(walker.getData());
      // Add the code necessary
	// to set up a loop that
	// 1. prints out what is in walker.data()
	// 2. moves walker to point to the next node
	// 3. loops until walker gets to null
	
    }
}