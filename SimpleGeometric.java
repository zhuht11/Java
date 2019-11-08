package hello;

public class SimpleGeometricObject
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public SimpleGeometricObject()
	{
		dataCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getcolor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
