package String;
import java.util.Scanner ; 
public class PracticeSet3 {

	public static void main(String[] args) {
	//	Write a Java program to convert a string to lowercase.
		
	/*	String  x = "Hi EveRYONE I AM NIR" ;
		
		System.out.println(x.toLowerCase());
	*/
	
	//Write a Java program to replace spaces with underscores.
	/*	String x = "Hi Everyone I am Neeraj" ;
		System.out.println(x.replace(" ","_"));

	*/
		
		
	//Write a Java program to fill in a letter template which 
	//looks like below:
	// letter = “Dear <|name|>, Thanks a lot”
	// Replace <|name|> with a string (some name)

		
	Scanner sc = new Scanner(System.in);
	String str1 = sc.next();
	System.out.println(str1);
	String letter = "Dear <|name|>, Thanks a lot";
	System.out.println(letter.replace("name","user"));
	
	

	}
}