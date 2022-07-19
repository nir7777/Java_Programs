package Array;

public class AboutArray {

	public static void main(String[] args) {

		int [] marks; //Declaration
		marks = new int[5]; // Memory Allocation
		marks[0] = 50; 
		marks[1] = 60;
		marks[2] = 65;
		marks[3] = 40;
		marks[4] = 42;
		
		System.out.println(marks[0]);
//		length of array
		System.out.println("Int array length " +marks.length);
		
//		Floating Point Array
		float [] score = {5.5f,66.10f,89,74,9.7f};
		System.out.println(score[4]);
		System.out.println("Floating array length " + score.length);
		
//		String Array
		String  [] students = { "Neeraj","Jayesh","Akshay","Abhishek"};
		System.out.println("String length " + students.length);
		System.out.println(students[2]);
		
		
//		Displaying  The Array (Naive(Simple Method))
		System.out.println("Displaying array Naive Method");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
//		Displaying Array Using For loop:(Array Traversal)
		System.out.println("Displaying array using for loop");
		int i;
		for(i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("Displaying above array in reverse order");
		for(i = marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("Using For each loop");
		for(int element:marks)
		{
			System.out.println(element);
		}
		
	
	}

}