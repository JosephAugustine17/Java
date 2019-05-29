public class Circle extends Shape

{
    int radius;
    double pi;

    public Circle (int radius, double pi)
    {
	this.radius = radius;
	this.pi = pi;
    }


    public double getArea ()
    {
	double area = radius*radius*pi;

	return (area);
    }


    public double getPerimeter ()
    {
	double perimeter = (2*pi*radius) ;
	return (perimeter);
    }
}
