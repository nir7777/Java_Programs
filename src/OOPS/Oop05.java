package OOPS;

//Create a class Rectangle with method to initialize its side, calculating area, perimeter etc.

class Circle
{
	public void CircleMethod()
	{
		float pi = 3.14f;
		int r = 8;
		int area = (r*r);
		
		float perimeter = 2 * pi*r;
		
		System.out.println("Area of Circle is " + area);
		System.out.print("Perimeter of Circle is " + perimeter);
		
	}


}

public class Oop05
{
	public static void main(String[] args) 
	{
	 Rectangle rec = new  Rectangle();
	 rec.RectangleMethod();
	}

}
