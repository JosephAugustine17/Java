public class Retangle extends Shape

{
    int length, width;

    public Retangle (int length, int width)
    {
	this.length = length;
	this.width = width;
    }


    public double getArea ()
    {
	double area = length * width;

	return (area);
    }


    public double getPerimeter ()
    {
	double perimeter = (2 * length) + (2 * width);
	return (perimeter);
    }
}


