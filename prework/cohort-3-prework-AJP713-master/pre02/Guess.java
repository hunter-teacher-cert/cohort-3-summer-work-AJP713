import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
      int secondsIn, hours, minutes, seconds;
      Scanner in = new Scanner(System.in);
      System.out.print("Input a number of seconds: ");
      secondsIn = in.nextInt();
      hours = secondsIn/(60*60);
      minutes = (secondsIn % (60*60))/60;
      seconds = (secondsIn % (60));
      System.out.printf("hours %d and minutes %d seconds %d\n", hours,minutes,seconds);
    
    }
}