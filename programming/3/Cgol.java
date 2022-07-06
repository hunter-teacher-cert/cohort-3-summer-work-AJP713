import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: First Last, First Last
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

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
     
      char [][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        board[i][j]='O';
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
        if(i > -1 && 
						i < board.length && 
						!(r==i && c==j) &&
						j > -1 &&
						j<board[0].length){
				
            if(board[i][j]=='X'){numNei++;}
          
        }
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
    int numN = countNeighbours(board, r, c);
    if(board[r][c]=='X'){
      if(numN == 2 || numN ==3){
        return 'X';
      }
      else{
        return 'O';
      }
    }else{
      if(numN == 3){
        return 'X';
      }
      else{
        return 'O';
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
    board = createNewBoard(10,10);
    
    //breathe life into some cells:
     setCell(board, 0, 1, 'X');
     setCell(board, 1, 2, 'X');
     setCell(board, 2, 0, 'X');
     setCell(board, 2, 1, 'X');
    setCell(board, 2, 2, 'X');
    // // TASK:
    // // Once your initial version is running,
    // // try out different starting configurations of living cells...
    // // (Feel free to comment out the above three lines.)
     System.out.println("Gen X:");
    printBoard(board);
    // System.out.println(countNeighbours(board,0,0));
    // System.out.println(getNextGenCell(board,10,10));
    // System.out.println(getNextGenCell(board,0,1));
   
     System.out.println("--------------------------\n\n");
    
    board = generateNextBoard(board);
   
    for(int i = 1; i<20; i++){
       System.out.println("--------------------------\n\n");
    
    board = generateNextBoard(board);
    System.out.println("Gen X:" + i );
    printBoard(board);
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class