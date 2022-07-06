/**
 * Array2DPractice by Team 9
 * Adam Prado
 * Sarah McCoy, Kirk Martin, Jihae Park
 */

import java.io.*;
import java.util.*;

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    /* YOUR AWESOME CODE HERE */
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
         System.out.print(board[i][j] + " "); //maybe we want commas between them?
      }
      System.out.println();
    }
    
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    for(int i = 0; i<board[row].length;i++){
      board[row][i] = value;
    }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    char[][] newBoard = new char[original.length][original[0].length];
    
    for (int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        newBoard[i][j]=original[i][j];
      }
    }
    return newBoard;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
     for (int i = row-1; i < row+2; i++) {
      for (int j = col-1; j < col+2; j++) {
        if(i > -1 && 
						i < board.length && 
						!(row==i && col==j) &&
						j > -1 &&
						j<board[0].length){
				
          board[i][j]='x';
          
        }
      }
     }
    /* YOUR AWESOME CODE HERE */ 
    // below are the positions of all neighboring cells
    // board[row-1][col-1]='X';  //up left
    // board[row-1][col]='X';    //up center
    // board[row-1][col+1]='X';  //up right
    // board[row][col-1]='X';       //mid left
    // board[row][col+1]='X';       //mid right
    // board[row+1][col-1]='X';    //bottom left
    // board[row+1][col]='X';      //bottom center
    // board[row+1][col+1]='X';    //bottom right

    // if(col>0){  //checks if left most column 
    //   board[row][col-1]='X';    //mid left
    // }
    // if(col<board[0].length-1){
    //   board[row][col+1]='X';  //mid right
    // }
    // if(row>0){   //check if not on top row, checks all 3 at once
    //   board[row-1][col]='X';  //top middle
    //    if(col>0){//checks if left most column 
    //      board[row-1][col-1]='X';  //top left
    //   }
    //   if(col<board[0].length-1){
    //     board[row-1][col+1]='X';  //top right
    //   }  
    // }
    // if(row<board.length-1){  //check if not on bottom row, all 3 at once
    //    if(col>0){//checks if left most column 
    //      board[row+1][col-1]='X';  //bottom left
    //    }
    //   board[row+1][col]='X';  //bottom middle
    //   if(col<board[0].length-1){
    //     board[row+1][col+1]='X';  //bottom right
    //   }
    // }
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if(board[i][j]== c){
          explodeSquare(board,i,j);
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    System.out.println("creates a board 5 rows, 10 columns, all z");
    char[][] b = buildBoard(10,10,'a');
    printBoard(b);
    //setRow(b,2,'@');
    System.out.println();
    printBoard(b);
    
    System.out.println();
    char[][] arrCopy = copyBoard(b);
    printBoard(arrCopy);
    System.out.println();
    System.out.println("This will explode the board at position 0,4 with x's");
    // explodeSquare(arrCopy,0,4);
      arrCopy[0][4]= 'c';
      arrCopy[3][5]= 'c';
      arrCopy[4][9]= 'c';
      printBoard(arrCopy);
    System.out.println();
      explodeAllChar(arrCopy, 'c');
      explodeAllChar(arrCopy, 'z');
      printBoard(arrCopy);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}