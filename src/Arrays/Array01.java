package Arrays;

public class Array01 {

	public static void main(String[] args) {
		//1.	Create an array of 5 floats and calculate their sum.
		
			float sum = 0.0f;
			float[] num = {23.6f,89.6f,56.12f,99.0f,41.3f};
			 for(float element:num)
			 {
		            sum = sum + element;
		     }
			
			System.out.println(sum);
		
	}

}
