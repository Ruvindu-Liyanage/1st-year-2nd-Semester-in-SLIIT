  
import java.util.Scanner;
class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating an scanner object to take inputs
        Kasun obj = new Kasun(); //creating an object

        System.out.print("Enter your name: "); //getting inputs
        String name = takeInput.nextLine();
        System.out.print("Enter your Height(m): ");
        Float heigh= takeInput.nextFloat();
        System.out.print("Enter your Weight: ");
        Float weight= takeInput.nextFloat();

        Float answer = obj.calculateBMI(heigh, weight); //calling the method

        System.out.print("Hello "+name +" Your BMI is :"+ answer+ "and You are a ");
        obj.Check(answer);
        System.out.print(" person");
        
    }

    Float calculateBMI(Float height, Float weight)
    {
        double x =weight/Math.pow(height,2);
        float BMI = (float)x;
       return BMI;
    }


void Check(float x)
{
    if(x>=0)
       {
           if(x<=18.5)
             System.out.println("Underweight");
             else
             if(x<=25)
             System.out.println("Healthry Weight");
            else 
            if(x<=30)
            System.out.println("Overweight");
            else 
            if(x<=40)
            System.out.println("Obese");
            else 
            if(x>41)
            System.out.println("Severly obese");
            else 
            System.out.println("Ultra Sound");
       }
}

}