package hello;

public class Test 
{

	public static void main(String[] args)
	{
		
		RegularPolygon myPolygon = new RegularPolygon();
		System.out.println(myPolygon.getPerimeter() + " " + myPolygon.getArea());
		RegularPolygon myPolygon2 = new RegularPolygon(6, 4);
		System.out.println(myPolygon2.getPerimeter() + " " + myPolygon2.getArea());
		RegularPolygon myPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(myPolygon3.getPerimeter() + " " + myPolygon3.getArea());
	}

}
