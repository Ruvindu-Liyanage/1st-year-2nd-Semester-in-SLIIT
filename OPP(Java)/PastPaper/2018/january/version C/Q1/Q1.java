import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating an scanner object to take inputs
        Kasun obj = new Kasun(); //creating an object

        System.out.print("Enter the velocity: "); //getting inputs
        double v = takeInput.nextDouble();
        System.out.print("Enter the radius of circular path: ");
        double cp= takeInput.nextDouble();
       

        double answer = obj.calculateCentripetal(v,cp); //calling the method
        System.out.println("Centripetal Force "+ Math.round(answer*10d)/10d); //rounding and calling the method

        System.out.print("Type of the Force is ");
        obj.CheckIP(Math.round(answer*10d)/10d); // calling the method call ChekIP
    }

    double calculateCentripetal(double v, double cp)
    {
      final double m =450.7d;
       double f=0d;
       f = m*Math.pow(v, 2)/cp;
       return f;
    }


void CheckIP(double x)
{
    if(x>=0)
       {
           if(x<=100)
             System.out.println("Low Impact");
             else
             if(x<=150)
             System.out.println("Normal Impact");
            else 
            if(x<=200)
            System.out.println("High Impact");
            else 
            System.out.println("Ultra Impact");
       }
}

}