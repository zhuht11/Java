package hello;

public class RegularPolygon
{
	private int n;
	private double side;
	private double x;
	private double y;
	public RegularPolygon()
	{	
		n = 3;
		side = 1;
		x = y = 0;
	}
	public RegularPolygon(int n, int side)
	{
		this.n = n;
		this.side = side;
		this.x = this.y = 0;
	}
	public RegularPolygon(int n, int side, double newX, double newY)
	{
		this.n = n;
		this.side = side;
		this.x = newX;
		this.y = newY;
	}
	public int getN()
	{
		return n;
	}
	public double getSide()
	{
		return side;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void setN(int newN)
	{
		n = newN;
	}
	public void setSide(double newSide)
	{
		side = newSide;
	}
	public void setX(double newX)
	{
		x = newX;
	}
	public void setY(double newY)
	{
		y = newY;
	}
	public double getPerimeter()
	{
		return n * side;
	}
	public double getArea()
	{
		return n * (side*side) / 4 * Math.tan(Math.PI / n);
	}
	
}
