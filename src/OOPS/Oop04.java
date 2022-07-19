package OOPS;

//Create a class Rectangle with method to initialize its side, calculating area, perimeter etc.

class Rectangle
{
	public void RectangleMethod()
	{
		int length = 8;
		int breadth = 10;
		int area = length*breadth;
		
		float perimeter = 2*(length+breadth);
		
		System.out.println("Area of Rectangle is " + area);
		System.out.print("Perimeter of Rectangle is " + perimeter);
		
	}


}

public class Oop04
{
	public static void main(String[] args) 
	{
	 Rectangle rec = new  Rectangle();
	 rec.RectangleMethod();
	}

}
