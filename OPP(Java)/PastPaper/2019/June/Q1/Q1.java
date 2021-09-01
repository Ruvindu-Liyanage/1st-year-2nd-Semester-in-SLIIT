import java.util.Scanner;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);  //create a object to get keyboard inputs
        Kasun obj = new Kasun(); // create an object


        System.out.print("Enter the index of refractionin material b: "); //getting inputs
        float n_b= takeInput.nextFloat();
        System.out.print("Enter the index of refractionin material a: ");
        float n_a= takeInput.nextFloat();
        System.out.print("Enter the angle of light relative to normal to the barrier in material b: ");
        int m_b= takeInput.nextInt();
        takeInput.close();


        float answer = obj.CalSnailAngle(n_b, n_a, m_b); //calling the method
        System.out.println("Angle of light relative to normal to the barrier in material a = "+answer); //print the answer without rounding


        float round_answer =(float)Math.round(answer*100)/100; //rounding the answer
        System.out.println("Round answer = "+round_answer); //print the round answer

        System.out.print("Angle is "); 
        obj.Check(round_answer);   //print the type of Angle
    }
  


    float CalSnailAngle(float n_b, float n_a, int m_b)
    {
    
        float Angle=(float)Math.asin(Math.sin(m_b)*n_b/n_a);
        return Angle;
    }

    void Check(float x)
    {
        if(x>=0)
          if(x<=30)
            System.out.println("Low Angel");
          else if(x<=45)
          System.out.println("Moderate Angle");
          else if(x<=90)
          System.out.println("High Angle");
          else
          System.out.println("Unknown");
    }

}