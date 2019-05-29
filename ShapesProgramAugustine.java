// The "ShapesProgramAugustine" class.
import java.awt.*;
import hsa.Console;

public class ShapesProgramAugustine
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//variables
	int choice = 0;
	int length = 0;
	int width = 0;
	int radius = 0;
	int height = 0;
	String className = "";
	double pi = Math.PI;
	Shape shapeRef = null;
	String input;
	int numElements = 0;
	boolean loop = true;
	do
	{
	    while (loop == true)
	    {
		c.clear ();
		c.println ("Main Menu");
		c.println ("1. Rectangle");
		c.println ("2. Square");
		c.println ("3. Triangle");
		c.println ("4.Circle");
		c.println ("5.Rhombus");
		c.println ("6.Exit \n");

		//Input and Prompt
		//getting the number of elements
		c.print ("Enter your choice: ");
		//error trapping loop

		//gets the input
		input = c.readLine ();
		loop = false;
		//checks if the number is a number and greater than 1
		try
		{
		    choice = Integer.parseInt (input);
		    if (choice < 1 || choice > 6)
		    {
			loop = true;
			c.print ("Please enter a number in the range: ");
		    }
		}
		//forces them to enter a new number if they enter an incorrect number
		catch (java.lang.NumberFormatException e)
		{
		    c.print ("Please enter a number: ");
		    loop = true;
		}
	    }
	    c.println ("");
	    switch (choice)
	    {
		case 1:
		    c.print ("Type in length: ");
		    length = c.readInt ();
		    c.print ("Type in width: ");
		    width = c.readInt ();
		    shapeRef = new Retangle (length, width);
		    className = Retangle.class.getName ();
		    break;
		case 2:
		    c.print ("Type in length: ");
		    length = c.readInt ();
		    shapeRef = new Square (length);
		    className = Square.class.getName ();
		    break;
		case 3:
		    c.print ("Type in length: ");
		    length = c.readInt ();
		    c.print ("Type in length: ");
		    width = c.readInt ();
		    c.print ("Type in height: ");
		    height = c.readInt ();
		    shapeRef = new Triangle (length, width, height);
		    className = Triangle.class.getName ();
		    break;
		case 4:
		    c.print ("Type in radius: ");
		    radius = c.readInt ();
		    shapeRef = new Circle (radius, pi);
		    className = Circle.class.getName ();
		    break;
		case 5:
		    c.print ("Type in length: ");
		    length = c.readInt ();
		    c.print ("Type in length: ");
		    width = c.readInt ();
		    shapeRef = new Rhombus (length, width);
		    className = Rhombus.class.getName ();
		    break;
		case 6:
		    c.print ("Exiting Program Press any key to terminate");
		    c.getChar ();
		    System.exit (0);
		    break;
	    }
	    c.println ("\n1. Area");
	    c.println ("2. Perimeter\n");
	    c.print ("Enter your choice ");
	    loop = true;
	    while (loop == true)
	    {

		//gets the input
		input = c.readLine ();
		loop = false;
		//checks if the number is a number and greater than 1
		try
		{
		    choice = Integer.parseInt (input);
		    if (choice < 1 || choice > 2)
		    {
			loop = true;
			c.println ("Please enter a number in the range");
		    }
		}
		//forces them to enter a new number if they enter an incorrect number
		catch (java.lang.NumberFormatException e)
		{
		    c.println ("Please enter a number");
		    loop = true;
		}
	    }

	    if (choice == 1)

		{

		    c.print ("\nArea of a " + className + "= ");
		    c.println (shapeRef.getArea ());
		}
	    else if (choice == 2)
	    {
		shapeRef.getPerimeter ();
		c.print ("Perimeter of a " + className + "= ");
		c.println (shapeRef.getPerimeter ());
	    }
	    c.println (" Press any key to continue");
	    c.getChar ();
	    c.clear ();
	    loop = true;
	}
	while (choice != 6)
	    ;

	// Place your program here.  'c' is the output console
    } // main method
} // ShapesProgramAugustine class


