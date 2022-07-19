package IfElse;
import java.util.Scanner;
public class Ifelse02 {

	public static void main(String[] args) {
		
//		2. Write a program to find out whether a student is pass 
//		or fail; if it requires a total of 40% and at least 33% 
//		in each subject to pass. Assume 3 subjects and take marks 
//		as input from the user.
		
		int sub1,sub2,sub3;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the marks of subject 1");
		sub1 = sc.nextInt(); 
		System.out.println("Enter the marks of subject 2");
		sub2 = sc.nextInt();
		System.out.println("Enter the marks of subject 3");
		sub3 = sc.nextInt();
		
		
			if(sub1>30 && sub2>30 && sub3>30) {
		int total = sub1+sub2+sub3;
		float per = (total*100)/356;
		System.out.println("You Got "+ per + " Percentage");
			if(per>40) {
				System.out.println(" Congrats You are Pass");
				}
			else {
				   System.out.println("You are fail");
			     }
		}
		else {
			System.out.println("Marks of subject is less than 30");
		} 
		

	}

}
