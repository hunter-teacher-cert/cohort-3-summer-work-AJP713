

public class ArrayTest
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
			//could it be board[i].length in case of jagged array?
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
    
		//TRYING DIFFERENT METHOD HERE--iterate through the items around the given one, and check if they are an edge.  If not edge, explode.....but having trouble with the edge cases.  Works in the middle.
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
    char[][] b = buildBoard(5,10,'z');
    printBoard(b);
		//replace 3rd row with "@"
    setRow(b,2,'@');
    System.out.println();
    printBoard(b);
    
    System.out.println();
		//copy board and print
    char[][] arrCopy = copyBoard(b);
    printBoard(arrCopy);
    System.out.println();
   
		//explode tests
    System.out.println("This will explode the board at position 0,4 with x's");
		//re-initializing the board to zs
		char[][] c = buildBoard(5,10,'z');
    explodeSquare(c,0,4);
    printBoard(c);

		System.out.println();
		
		System.out.println("This will explode the board at position 0,0 with x's");
		char[][] d = buildBoard(5,10,'z');
    explodeSquare(d,4,9);
		printBoard(d);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}