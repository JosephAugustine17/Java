// The "MagicSquare" class.
//Joseph Augustine
//Saturday, April 8,2016
import java.awt.*;
import hsa.Console;

public class MagicSquare
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//Variables
	int[] [] square = new int [4] [4];
	boolean check3 = false;

	//Output and Processing
	c.println ("Welcome to Magic Square");
	for (int rows = 0 ; rows < 4 ; rows++)
	{
	    for (int columns = 0 ; columns < 4 ; columns++)
	    {

		displaySquare (square);
		//Input and Prompt
		//Enters Values on the board
		c.print ("Enter a number for row " + (rows + 1) + " column " + (columns + 1) + ": ");
		square [rows] [columns] = c.readInt ();
		c.clear ();

	    }

	}
	c.clear ();
	//Column and Row checker. 
	boolean check1 = rowsCheck (square);
	boolean check2 = columnsCheck (square);

	// Value of Rows and Columns
	int row = rowsAdding (square);
	int column = columnsAdding (square);

	//Diagonal Checker
	boolean diag1 = diagonalCheck1 (square, row, column);
	boolean diag2 = diagonalCheck2 (square, row, column);

	//Check if Diagonal value=Row/Colum vlue;
	if (diag1 == true && diag2 == true)
	{
	    check3 = true;
	}

	if (check1 == true && check2 == true && check3 == true)
	{
	    c.println ("This is a magic square");
	}
	else
	{
	    c.println ("This is not a magic square");
	}

	//Final Display of Board
	displaySquare (square);






	// Place your program here.  'c' is the output console
    } // main method


    /**
      *Checks Rows and checks if they add up
      * pre: rows<4, columns<4
      * post: return true or false
      */
    public static boolean rowsCheck (int[] [] square)
    {

	int[] sum = new int [4];
	for (int columns = 0 ; columns < 4 ; columns++)
	{
	    for (int rows = 0 ; rows < 4 ; rows++)
	    {
		sum [columns] = square [rows] [columns] + sum [columns];
	    }

	}
	//compares row 1 sum to 2,3, and row 4
	if (sum [0] == sum [2] && sum [0] == sum [3] && sum [0] == sum [1])

	    {
		return true;
	    }
	else
	{
	    return false;
	}
    }


    /**
      *Adds each Row and checks if they equal eachother
      * pre: rows<4, columns<4
      * post: returneValue returned
      */
    public static int rowsAdding (int[] [] square)
    {

	int[] sum = new int [4];
	int returnValue = 0;
	for (int columns = 0 ; columns < 4 ; columns++)
	{
	    for (int rows = 0 ; rows < 4 ; rows++)
	    {
		sum [columns] = square [rows] [columns] + sum [columns];
	    }

	}
	if (sum [0] == sum [2] && sum [0] == sum [3] && sum [0] == sum [1])
	{
	    returnValue = sum [0];

	}
	return returnValue;
    }


    /**
      *Checks columns and checks if they add up
      * pre: rows<4, columns<4
      * post: return true or false
      */
    public static boolean columnsCheck (int[] [] square)
    {

	int[] sum = new int [4];
	for (int rows = 0 ; rows < 4 ; rows++)
	{
	    for (int columns = 0 ; columns < 4 ; columns++)
	    {
		sum [rows] = square [columns] [rows] + sum [rows];
	    }

	}
	//compares columns 1 sum to 2,3, and row 4
	if (sum [0] == sum [2] && sum [0] == sum [3] && sum [0] == sum [1])

	    {
		return true;
	    }
	else
	{
	    return false;
	}
    }


    /**
       *Adds each column and checks if they equal eachother
       * pre: rows<4, columns<4
       * post: returneValue returned
       */
    public static int columnsAdding (int[] [] square)
    {

	int[] sum = new int [4];
	int returnValue = 0;
	for (int rows = 0 ; rows < 4 ; rows++)
	{
	    for (int columns = 0 ; columns < 4 ; columns++)
	    {
		sum [rows] = square [columns] [rows] + sum [rows];
	    }
	}
	if (sum [0] == sum [2] && sum [0] == sum [3] && sum [0] == sum [1])
	{
	    returnValue = sum [0];
	}
	return returnValue;
    }


    /**
      *Checks Diagonal 1 and checks if they equal rows and column
      * pre: rows<4, columns<4
      * post: return true or false
      */
    public static boolean diagonalCheck1 (int[] [] square, int row, int column)
    {

	int sum = 0;
	for (int rows = 0 ; rows < 4 ; rows++)
	{
	    int columns = rows;

	    sum = square [columns] [rows] + sum;


	}
	if (sum == row && sum == column)

	    {
		return true;
	    }
	else
	{
	    return false;
	}
    }


    /**
      *Checks Diagonal 2 and checks if they equal rows and column
      * pre: rows<4, columns<4
      * post: return true or false
      */
    public static boolean diagonalCheck2 (int[] [] square, int row, int column)
    {
	int columns = 0;
	int sum = 0;

	for (int rows = 3 ; rows < 0 ; rows = rows - 1)
	{
	    sum = square [rows] [columns] + sum;
	    columns = columns + 1;
	}

	if (sum == row && sum == column)

	    {
		return true;
	    }
	else
	{
	    return true;
	}
    }


    /**
      *Print 4x4 Grid and numbers inputted
      * pre: rows<4, columns<4
      * post: 4x4 Grid printed with numbers
      */
    public static void displaySquare (int[] [] square)
    {
	c.drawRect (50, 50, 400, 400);
	c.drawRect (50, 50, 400, 100);
	c.drawRect (50, 150, 400, 100);
	c.drawRect (50, 250, 400, 100);
	c.drawRect (50, 50, 100, 400);
	c.drawRect (150, 50, 100, 400);
	c.drawRect (250, 50, 100, 400);
	String[] [] number = new String [4] [4];
	c.setFont (new Font ("Times New Roman", Font.BOLD, 26));

	{
	    for (int row = 0 ; row < 4 ; row++)
	    {
		for (int column = 0 ; column < 4 ; column++)
		{
		    number [row] [column] = Integer.toString (square [row] [column]);
		    c.drawString (number [row] [column], 80 + column * 100, 115 + row * 100);
		}
	    }


	}
    }



}


// MagicSquare class


