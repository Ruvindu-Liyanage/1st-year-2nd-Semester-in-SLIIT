import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating an scanner object to take inputs
        Kasun obj = new Kasun(); //creating an object

        System.out.print("Enter the frequency of the source: "); //getting inputs
        Float fs = takeInput.nextFloat();
        System.out.print("Enter the velocity of the listerner: ");
        Float vl= takeInput.nextFloat();
        System.out.print("Enter the velocity of the source: ");
        Float vs= takeInput.nextFloat();

        Float answer = obj.calculateDoppler(fs, vs, vl); //calling the method
        System.out.println("Frequency heard by listener "+ Math.round(answer*100f)/100f); //rounding and calling the method

        System.out.print("Nature of the frequency is ");
        obj.CheckIP(Math.round(answer*100f)/100f); // calling the method call ChekIP
    }

    Float calculateDoppler(Float fs, Float vs , Float vl)
    {
        Float v =360.5f;
        Float fh=0f;
       fh =  fs*(v+vl)/(v-vs);
       return fh;
    }


void CheckIP(double x)
{
    if(x>=0)
       {
           if(x<=100)
             System.out.println("Low Frequency");
             else
             if(x<=150)
             System.out.println("Normal Frequncy");
            else 
            if(x<=200)
            System.out.println("High Frequncy");
            else 
            System.out.println("Ultra Sound");
       }
}

}