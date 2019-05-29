public class Triangle extends Shape
{
    int length,width,height ;
    public Triangle (int length,int width,int height)
    {
	this.length = length;
	this.width=width;
	this.height=height;
    }


    public double getArea ()
    {
	double s = (length+width+height)/2;
	double area= Math.sqrt (s*(s-length)*(s-width)*(s-height));

	return (area);
    }


    public double getPerimeter ()
    {
	double perimeter = length+width+height;
	return (perimeter);
    }
}
