package OOPS;



	
//		Create a class cellphone with methods to print "ringing...", "vibrating...", etc.
		
		class Cellphone
		{
			public void Ringing()
			{
				System.out.println("Phone is Ringing");
			}

			public void Vibrating()
			{
				System.out.println("Phone is  Vibrating");
			}
		}
		
		public class Oop02 {
			
		public static void main(String[] args) 
		{

				Cellphone cell = new Cellphone();
				cell.Ringing();
				cell.Vibrating();
				
		}

}
