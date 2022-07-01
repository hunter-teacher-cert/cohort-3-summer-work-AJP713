/**
 * Game of Nim
 * Adam Prado
 */


import java.io.*;
import java.util.*;
import java.util.Random;


public class Nim
{
 public static void main(String[] args )
  {
    int stones = 12;  // stones still in bag
    int stonesTaken = 0;   //how many stones are taken in a turn
    int randomNum = 0; // so computer can select a random #
    Random rand =  new Random();
    int winner = 0; //this is used to keep track of who wins, player win = 1,  CPU win = 0  
    Scanner input = new Scanner(System.in);
    //loop until game ends
    while(stones > 0){
      System.out.println("Stones still in bag: " + stones);
      System.out.print("How many stones do you want to take: ");
      stonesTaken = input.nextInt();  //gets user input for # of stones to take
      System.out.println("You took " + stonesTaken + " stones"); //prints to console
      
      while(stonesTaken>3 || stonesTaken<1 || stonesTaken>stones){ // checks that the # of stones selected by user is a valid #, if it's invalid 
        
      System.out.println("Invalid number of stones, try again.  Pick a number between 1 and 3");  
      System.out.println("Stones still in bag: " + stones);
      System.out.print("How many stones do you want to take: ");
      stonesTaken = input.nextInt();  
      System.out.println("You took " + stonesTaken + " stones");
      }
      
      stones = stones - stonesTaken;  //updates total number of stones int he bag after player turn  
      if(stones < 1){  // if game ends here the player has won
        winner = 1;
      }
      System.out.println("Stones still in bag: " + stones);
      randomNum = rand.nextInt(3)+1;  //selects random number for computer player
      System.out.println("The computer player takes " +randomNum + " stones");
      stones = stones - randomNum;  //updates stones in bag after computer turn
        
     
      
    }
    System.out.println("Game Over");
    if(winner == 0){  //depending on who's turn it is at the end, that player will win.  
      System.out.print("CPU wins");
    }else{
      System.out.print("You win!");
    }
    
  }
}