public class Rhombus extends Shape
{
    int height, width;
    Rhombus (int height, int width)
    {
	this.height = height;
	this.width = width;
    }


    public double getArea ()
    {
	double area = height * width;
	return area;
    }


    public double getPerimeter ()
    {
	double perimeter = 4 * width;
	return perimeter;
    }
}




