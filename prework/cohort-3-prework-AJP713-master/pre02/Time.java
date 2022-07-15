import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
      int hour = 16; //starting times
      int minute = 20;
      int second = 35;
      int secondsMid = (hour*60*60) + (minute*60)+second; //time since midnight
      int secondsLeft = (24*60*60) - secondsMid;
      double percentDay = secondsMid/(24.0*60.0*60.0);

  
      System.out.println("seconds since midnight: ");
      System.out.println(secondsMid);
      System.out.println("seconds left in the day:");
      System.out.println(secondsLeft);
      System.out.println("percent of day left:");
      System.out.println(percentDay);

      hour = 16;  //current times
      minute = 33;
      second = 41;

      int elapsedTime = ((hour*60* 60)+(minute*60)+second)- secondsMid;

      System.out.println("elapsed time of coding:");
      System.out.println(elapsedTime);
     
    }
}