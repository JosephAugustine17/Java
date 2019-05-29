public class Square extends Shape
{
    int length;
    public Square (int length)
    {
	this.length = length;
    }


    public double getArea ()
    {
	double area = length * length;

	return (area);
    }


    public double getPerimeter ()
    {
	double perimeter = (4 * length);
	return (perimeter);
    }
}
