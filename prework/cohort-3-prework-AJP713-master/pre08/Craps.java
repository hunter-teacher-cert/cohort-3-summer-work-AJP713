//pre08 craps game simulator

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Craps{
  public static void main(String[] args){
      int rounds;
      // gets input for the number of rounds
      Scanner in = new Scanner(System.in);
      System.out.print("Select the number of rounds: ");
      rounds = in.nextInt();
      System.out.println("You will play " + rounds + " rounds"); //prints to console
      int roundCount = 1;
      int wins = 0;
      // plays the correct number of rounds and keeps track of wins
      for(int i = 0; i<rounds;i++){
        System.out.println("\nround number: "+ roundCount);
        if(round()==1){
            wins ++;
        }
        roundCount++;
      }
      System.out.println("\nYou won "+ wins +", and lost " + (rounds-wins));
    
  }
// selects a random integer up for the max input
  public static int roll(int maxDice){
    Random random = new Random();
    int number = random.nextInt(maxDice) + 1;
    return number;
  }
  //returns the sum of a number of dice with a max dice value. 
  public static int shoot(int numDice, int maxDice){
    int sum = 0;
    for (int i = 0; i<numDice;i++){
      sum = sum + roll(maxDice);
      //System.out.println("sum so far " +sum);
    }
    return sum;
  }

  //simulates a round of craps with first roll and if needed future rolls until the player wins or loses.  1 is returned on win, 0 on less, and print statements update the flow of the rounds rolls.
  public static int round(){
    int firstRoll = shoot(2,6);
    if (firstRoll == 7 || firstRoll == 11){
      System.out.println("you win on come out roll with: " + firstRoll);
      return 1;
    }else if(firstRoll == 2 || firstRoll==3 || firstRoll==12){
      System.out.println("you lose on come out roll with: " + firstRoll);
      return 0;
    }else{
      System.out.println("point set at:  " + firstRoll);
      return matchOrCrap(firstRoll);
    }
  }
  // this takes a starting roll and then keeps rerolling until the next roll matches it or a 7 is rolled and the player loses the round.  1 returned for win, 0 for loss, 
  public static int matchOrCrap(int startRoll){
    boolean finished = false;
    while(!finished){
      int nextRoll = shoot(2,6);
        System.out.println("your next roll was " + nextRoll);
      if(nextRoll == startRoll){
        System.out.println("you win matching roll: " + nextRoll);
        return 1;
      }else if(nextRoll==7){
        System.out.println("you lose, rolled: " + nextRoll);
        return 0;
      }
    }return 888;//this should never occur
  }
}