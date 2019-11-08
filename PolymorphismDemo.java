package hellos;

public class PolymorphismDemo 
{

	public static void main(String[] args) 
	{	
		displayObject(new CircleFromSimpleGeometric(1, "red", true));
		displayObject(new CircleFromSimpleGeometric(1, 1, "black", true));
		
	}
	public static void displayObject(SimpleGeometricObject object)
	{
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
