package Arrays;

public class Array02 {

	public static void main(String[] args) {
		//2.	Write a program to find out whether a given integer is present in an array or not.
		
			int number[] = {20,56,98,4,1,255,78};
			int find = 255;
			
			for(int i:number)
			{
				if(i==find)
				{
					System.out.println(find +" Elment Found ");
				}
			}
		
			
	}

}
