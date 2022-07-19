package OOPS;


//Create A class Employee with following properties and Methods:

class Employe{
	int salary;
	String name;
	
	
	public int getSalary()
	{
		
		return salary;
	}
	
	public String getName()
	{
		
		return name;
	}
	
	public void setName(String  n)
	{
		name = n;
		
	}
	
}


public class Oop01 {

	public static void main(String[] args) {
		
	
		Employe neeraj = new Employe();
			neeraj.setName("Nir");
			neeraj.salary = 20000;
			
			System.out.println(neeraj.getSalary());
			System.out.println(neeraj.getName());
			
			

	}

}
