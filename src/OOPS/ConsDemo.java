// .Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating 
// a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed 
// as parameters to its constructor.

class Rectangle
{
    int length;
    int breadth;

    Rectangle(int l, int b)
    {
        this.length=l;
        this.breadth=b;

    }

    public int Area()
    {
        return length*breadth;    
    }
}

public class ConsDemo
{
    public static void main(String[] args)
    {
        Rectangle obj1 = new Rectangle(4,5);
        Rectangle obj2 = new Rectangle(5,8);

        System.out.println(obj1.Area());
        System.out.println(obj2.Area());
    }
}