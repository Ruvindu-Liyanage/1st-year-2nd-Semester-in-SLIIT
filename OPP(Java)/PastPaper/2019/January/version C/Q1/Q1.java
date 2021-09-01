import java.util.Scanner;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in); //creating scanner to get inputs
        Kasun obj = new Kasun();  //creating an object

        System.out.print("Enter the proper lenght in the refeence frame in which the object is at rest: "); //ask for inputs
        double l = takeInput.nextDouble(); //get inputs

        System.out.print("Enter the Velocity: ");
        double v = takeInput.nextDouble();

        float answer = obj.calLengthCont(l,v); //calling a method
        System.out.println("observed lenght is : :" +answer ); // print the answer without rounding 

        float round_answer = Math.round(answer*100f)/100f; //to round the answer
        System.out.println("rounded answer: "+ round_answer);//print the round answer

         System.out.print("Length type is: ");
         obj.Check(round_answer); //call  a method
        

    }

    float calLengthCont(double l, double v)
    {
        final double c = 3.0* Math.pow(10, 8);
      
         double o_l =Math.sqrt(1-Math.pow((v/c), 2)) *l;
         float answer = (float)o_l;
    return answer;
    }


    void Check(float x)
    {
        if(x>=0)
          if(x<=500)
             System.out.println("Short");
             else 
              if(x<=1000)
                System.out.println("Medium");
                else
                System.out.println("Long");
    }
}