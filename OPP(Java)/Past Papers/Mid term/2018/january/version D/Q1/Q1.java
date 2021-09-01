import java.util.Scanner;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating an scanner object to take inputs
        Kasun obj = new Kasun(); //creating an object

        System.out.print("Enter the velocity: "); //getting inputs
        float v = takeInput.nextFloat();
        System.out.print("Enter the radius of circular path: ");
        float cp= takeInput.nextFloat();
       takeInput.close();

        float answer = obj.calculateCentripetal(v,cp); //calling the method
        System.out.println("Centripetal Force "+ Math.round(answer*1000f)/1000f); //rounding and calling the method

        System.out.print("Type of the Force is ");
        obj.CheckIP(Math.round(answer*1000f)/1000f); // calling the method call ChekIP
    }

    float calculateCentripetal(float v, float cp)
    {
      float a =250.74f;
      float f;
       f= a*v*v/cp;
       return f;
    }

    void CheckIP(float x)
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