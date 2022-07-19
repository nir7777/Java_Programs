package String;
import java.util.Scanner ;

public class StringMethods {
	public static void main(String[] args) {
		
		String name = "NeErAj";
        System.out.println("Default string" + " "+ name);
		
		// 1. length()
	/*
		  int value = name.length();
		  System.out.println(value);
	*/
		
		//2. toLowerCase()
	/*  String lstring = name.toLowerCase();
		System.out.println(lstring);
	*/
		
	    //3. toUpperCase()
	/*	String ustring = name.toUpperCase();
		System.out.println(ustring); // NEERAJ
	*/
		
		//4. trim()
	/*	String nonTrimmedString = "  Java   ";
		System.out.println(nonTrimmedString);
		String TrimmedString = nonTrimmedString.trim();
		System.out.println(TrimmedString); //Java 
	*/
		
		//5. substring(int start)
	/*	String sub  = name.substring(2);
		System.out.println(sub); // ErAj
	*/
	 	//6. substring(int start, int end)
	/*	String sub2 = name.substring(2,5);
		System.out.println(sub2); // ErA
	*/
	
		//7. name.replace('r','p')
    /*  String s1 = "Harry";
		String rep = s1.replace('r','p');
		System.out.println(rep); //Happy
		System.out.println(s1.replace("rry","ier"));//Haier
		System.out.println(s1.replace("r","ier"));//Haieriery
	*/	
		//8. startswith("E")
//	    Boolean starts = name.startsWith("x");
	/*  Boolean starts = name.startsWith("Ne");
		System.out.println(starts); // false
	*/
	
		//9. endswith("j")
	//	Boolean ends = name.endsWith("j");
	/*	Boolean ends = name.endsWith("Aj");
		System.out.println(ends); // true
	*/
		
		//10. charAt(index num)
	/*	char x = name.charAt(1);
		System.out.println(x);
	*/
        
        //11. indexOf(str)
        // name = NeErAj
    /*  System.out.println(name.indexOf("e")); //1
        System.out.println(name.indexOf("rAj")); //3
    */   
        
        
        //12. indexOf("e","1")
    /*  String s1 = "Neeraej"; 
        System.out.println(s1.indexOf("e",3));
	*/
        
        
        //13.lastIndexOf("a"):
    /*  String s1 = "Neeraja";
        System.out.println(s1.lastIndexOf('a'));
    */
        
        //14. lastIndex("a",5)
    /*  String s1 = "Neeraja";
        System.out.println(s1.lastIndexOf('a',4));
	*/
        
        
	}
}