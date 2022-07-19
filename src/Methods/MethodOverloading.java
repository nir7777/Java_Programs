package Methods;

public class MethodOverloading {
	
	
	     int multiply(int a,int b){
	        return a*b;
	    }
	    double multiply(double a,double b){
	         return  a*b;
	    }
//	static void tellJoke()
//	{
//		System.out.println("I invented new word Plagarism!");
//	}

//	class Calculate
	
	
	
	
	
	public static void main(String[] args) {
//		tellJoke();
		MethodOverloading obj = new MethodOverloading();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

	}

	
}