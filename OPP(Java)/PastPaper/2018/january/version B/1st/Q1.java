import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating an scanner object to take inputs
        Kasun obj = new Kasun(); //creating an object

        System.out.print("Enter the frequency of the source: "); //getting inputs
        double fs = takeInput.nextDouble();
        System.out.print("Enter the velocity of the listerner: ");
        double vl= takeInput.nextDouble();
        System.out.print("Enter the velocity of the source: ");
        double vs= takeInput.nextDouble();

        double answer = obj.calculateEffect(fs, vs, vl); //calling the method
        System.out.println("Frequency heard by listener "+ Math.round(answer*100d)/100d); //rounding and calling the method

        System.out.print("Nature of the frequency is ");
        obj.CheckIP(Math.round(answer*100d)/100d); // calling the method call ChekIP
    }

    double calculateEffect(double fs, double vs , double vl)
    {
       double v =320.25d;
       double fh=0d;
       fh =  fs*(v+vl)/(v-vs);
       return fh;
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