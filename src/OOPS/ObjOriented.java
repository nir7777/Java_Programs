package OOPS;

 class Employee{
	 int id ;
	 String name;
	 int salary;
	 
	 public void printDetails() {
		 
		System.out.println("My id is " + id);
		System.out.println("My name is " + name);
		System.out.println(" ");
		
	 }
	 
	 public int getSalary() {
		 return salary;
	 }
	 
 }


public class ObjOriented {

	public static void main(String[] args) {
		System.out.println("This is our ObjOriented Class");
		
		Employee neeraj = new Employee(); //creating new Employee object
		Employee jhon = new Employee(); //creating new Employee object
		
		neeraj.id = 12;
		neeraj.name = "Neeraj Ahire";
		neeraj.salary = 10000;
		
		jhon.id = 13;
		jhon.name = "Jhon Mark";
		jhon.salary = 20000;
		
		neeraj.printDetails();
		jhon.printDetails();
		int salary = jhon.getSalary();
		System.out.println("Salary of Jhon is " + salary);
		System.out.println("Salary of Neeraj is " + neeraj.salary);

		
	}

}
