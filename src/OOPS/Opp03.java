package OOPS;

//Create a class Square with method to initialize its side, calculating area, perimeter etc.

class Square
{
	public void SqMethod()
	{
		int side = 8;
		int area = side*side;
		float perimeter = 4*side;
		
		System.out.println("Area of Square is " + area);
		System.out.print("Perimeter of Square is " + perimeter);
		
	}


}

public class Opp03 
{
	public static void main(String[] args) 
	{
	 Square sq = new  Square();
	 sq.SqMethod();
	}

}
