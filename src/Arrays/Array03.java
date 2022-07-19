package Arrays;

public class Array03 {

	public static void main(String[] args) {
		//3.	Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
			int [] marks = {55,75,96,88,45};
			float add = 0.0f;
			for(int j :marks)
			{
				add = add + j;
			}
			float avg = add/marks.length;
			System.out.println(avg);
		
	}

}
