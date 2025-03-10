package hello;

public class CircleFromSimpleGeometricObject 
{
	extends SimpleGeometricObject
	private double radius;
	public CircleFromSimpleGeometricObject()
	{
	}
	public CircleFromSimpleGeometricObject(double radius)
	{
		this.radius = radius;
	}
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled)
	{
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public double getDiameter()
	{
		return 2 * radius;
	}
	public double Perimeter()
	{
		return 2 * radius * Math.PI;
	}
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
