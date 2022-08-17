package Naveen.QTautomation;

public class ClassDoctor {
	
	

		void doctor()
		{
			System.out.println("Doctor details");
		}
		
		class Surgeon extends ClassDoctor {
			
			void Surgeon()
			{
				System.out.println("surgeon details");
			}
		 
			class hospital extends ClassDoctor{
				
				void hospital() 
				{
				System.out.println("Hospital details");	
				}
			}
			
			Surgeon S1=new Surgeon();
			hospital h1=new hospital();
		
			
			
	}

}
