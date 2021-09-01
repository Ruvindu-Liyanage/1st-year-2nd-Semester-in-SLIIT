import java.util.Scanner;

class Calculate {

    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);//creating scanner method to get intput
        Calculate obj = new Calculate(); //creating an object

        System.out.print("Enter the Distance:");
        float distance = takeInput.nextFloat();
        System.out.print("Enter the Density:");
        int density = takeInput.nextInt();
        
        float C_Constant  =  obj.calculateCosmology(distance, density);
        System.out.println("Cosmological Constant is " + C_Constant );
        float round_answer = Math.round(C_Constant*10f)/10f;
        System.out.println("Cosmological Constant is " + round_answer );

        System.out.print("Cosmology rate is ");
         obj.Check_rate(round_answer);
    }
    
    float calculateCosmology(float c, int p)
    {
        float gravity = 6.67408f;
        float PI = 22/7f;
        float answer;

        answer = (8*PI*gravity)/(3*(c*c))*p;

     return answer;
    }


void Check_rate(float x)
{
    if(x>=0 && x<=100)
      System.out.println("Below Normal");
      else if(x>100 && x<=200)
      System.out.println("Normal");  
      else  if(x>200 && x<=300)
      System.out.println("Above Average");
      else  if(x>300)
      System.out.println("High");

}

}