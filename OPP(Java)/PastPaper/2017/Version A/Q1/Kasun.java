import java.util.Scanner;
class Kasun
{
  public static void main(String[] args)
   {
	Scanner takeInput = new Scanner(System.in); //creating scanner object
	Kasun obj = new Kasun(); //creating an object

	System.out.print("Enter Your Name: "); //ask for inputs
	String name = takeInput.nextLine(); //getting inputs
	
	System.out.print("Enter your age:");
	int age = takeInput.nextInt();
	
	System.out.print("Enter Your pulseRate:");
	float rate = takeInput.nextFloat();

	obj.calculateHeartrate(name, age, rate); //calling the method

   }
	
	void calculateHeartrate(String name, int age, float rate)
		{
		  double x = Math.sqrt(rate*60);
		  float r_r = (float)x;
		  String level =" ";
 	
		  if(r_r>=0 && r_r<=60 && age>=0 && age<=18)
           	 level = "Below Normal";

 		   else if(r_r>60 && r_r<=65 && age==18)
          	  level = "Normal";

 		   if(r_r>70 && r_r<=120 && age>18 && age<=28)
           	 level = "Above Averge";

 		   if(r_r>120 && age>=28)
            	level = "High";

	System.out.println("Hello " + name +", Your Resting Heart Rate is "+r_r);
	System.out.println("Level of Activity "+level);
    
		}

}
