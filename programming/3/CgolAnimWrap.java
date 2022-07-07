import java.io.*;
import java.util.*;
import java.util.Random;

/**
 * Conway's Game of Life by Team 6
 * Adam Prado
 * Michael Randazzo, Aasine Cassara,	Jenna Lin
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class CgolAnimWrap
{
static char dead = '-';
static char alive = '@';

  static String CLEAR_SCREEN =  "\033[2J";
  static String TO_TOP_OF_SCREEN = "\033[1;1H";
  static String HIDE_CURSOR = "\033[?25l";

   public static void wait(int millis){
    try{
        Thread.sleep(millis);
    }catch(InterruptedException e){}
  }

  
  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
     
      char [][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        board[i][j]= dead;
      }
    }
    return board;
  

  }
public static char[][] createRandomBoard( int rows, int cols, int prob )
  {
    
    Random rand =  new Random();
    int randomNum = rand.nextInt(101);
    
      char [][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          randomNum = rand.nextInt(101);
          if(prob>randomNum){
            board[i][j]= dead;
          }else{
            board[i][j]= alive;
          }
    }
   
  

  }
    return board;
}
  //print the board to the terminal
public static void printBoard( char[][] board )
  {
 for (int i = 0; i < board.length; i++)
    {
       for (int j = 0; j < board[i].length; j++)
       {
         System.out.print(board[i][j]);
       }
       System.out.println(); 
    }
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
      board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
      int numNei=0;
      for (int i = r-1; i < r+2; i++) {
      for (int j = c-1; j < c+2; j++) {
        if(i > -1 && i < board.length && //checks if within left and right edges of board
						!(r==i && c==j) &&  //does not count the cell itself
						j > -1 && j<board[0].length){ //checks if within top and bottom edges of board
				
            if(board[i][j]==alive){numNei++;} //if neighbor is alive adds to the counter
          
        }  else if(i==-1 && !(r==i && c==j) && j > -1 && j<board[0].length){ //if cell is on top row, adds wrapped cells on the bottom row
          //System.out.println("top");
          if(board[board.length-1][j]==alive){numNei++;}
        } else if(i==board.length && !(r==i && c==j) && j > -1 && j<board[0].length){//if cell is on bottom row, adds wrapped cells on the top row
          //System.out.println("bottom");
          if(board[0][j]==alive){numNei++;}
        }else if(j==-1 && i > -1 && i < board.length && !(r==i && c==j) ){//if left wraps check far right column
         // System.out.println("left");
          if(board[i][board[0].length-1]==alive){numNei++;}
        }else if(j==board[0].length && i > -1 && i < board.length && !(r==i && c==j)){  //if right side wraps
          //System.out.println("right");
          if(board[i][0]==alive){numNei++;}
        } //TODO 4corner cases 
      }
    
 
  }
    return numNei;
  }

  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    int numN = countNeighbours(board, r, c);// counts how many neighbors for the cell
    if(board[r][c]==alive){  
      if(numN == 2 || numN ==3){ //when starting alive and 2 or 3 neighbors
        return alive;
      }
      else{
        return dead;
      }
    }else{ //when starting cell is dead
      if(numN == 3){
        return alive;
      }
      else{
        return dead;
      }
    }
    
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    char[][] newBoard = new char[board.length][board[0].length];
    
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        newBoard[i][j]= getNextGenCell(board,i,j);
      }
    }
    return newBoard;
  }

  

  public static void main( String[] args )
  {
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(5,5);
    setCell(board, 0, 1, alive);
     setCell(board, 1, 2, alive);
     setCell(board, 2, 0, alive);
     setCell(board, 2, 1, alive);
     setCell(board, 2, 2, alive);
    setCell(board, 0, 3, alive);
    setCell(board, 4, 4, alive);
    setCell(board, 4, 3, alive);
     setCell(board, 1, 4, alive);
    printBoard(board);
      System.out.println();
    System.out.println("Count Neigh 0, 1:  "+ countNeighbours(board, 0,1) + "  ->1");
    System.out.println("Count Neigh 4, 2:  "+ countNeighbours(board, 4,2) + "  ->3");
    System.out.println("Count Neigh 4, 3:  "+ countNeighbours(board, 4,3) + "  ->2");
    System.out.println("Count Neigh 1, 4:  "+ countNeighbours(board, 1,4) + "  ->2");
    System.out.println("Count Neigh 2, 0:  "+ countNeighbours(board, 2,0) + "  ->2");
    System.out.println("Count Neigh 0, 0:  "+ countNeighbours(board, 0,0) + "  ->2");
    System.out.println("Count Neigh 2, 0:  "+ countNeighbours(board, 2,0) + "  ->2");
    //breathe life into some cells:
    // sets up a "glider"
     // setCell(board, 0, 1, alive);
     // setCell(board, 1, 2, alive);
     // setCell(board, 2, 0, alive);
     // setCell(board, 2, 1, alive);
     // setCell(board, 2, 2, alive);
    //System.out.println("Gen X:");
   // printBoard(board);

    
    System.out.println(CLEAR_SCREEN + HIDE_CURSOR);
    board = createRandomBoard(30,50,50);
       for(int i = 0 ; i < 200; i++){
      //Do this each time you want to display a board
      //and overwrite the old version.
      System.out.println(TO_TOP_OF_SCREEN);
      board = generateNextBoard(board);
    
      printBoard(board);
      wait(150);
    }
    
   
  }//end main()

}//end class