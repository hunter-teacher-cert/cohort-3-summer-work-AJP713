import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
      String day = "Saturday";
      int date = 2;
      String month = "April";
      int year = 2022;

      // System.out.println(day);
      // System.out.println(date);
      // System.out.println(month);
      // System.out.println(year);
      System.out.println("American format:");
      System.out.println(day + ", "+ month + " " +date + ", " + year);
      System.out.println("European format:");
      System.out.println(day + " " + date + " "+ month + " "+year);
      
        //System.out.println("Hello world!"); //prints to console
    }
}
