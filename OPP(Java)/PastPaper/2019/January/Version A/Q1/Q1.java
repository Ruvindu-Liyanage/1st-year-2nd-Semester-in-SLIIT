import java.util.Scanner;

class Kasun
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        Kasun obj = new Kasun();

        System.out.print("Enter moral mass of the gass in killograms per mole: ");
        double m = takeInput.nextDouble();

        System.out.print("Enter the temperature in kelvin: ");
        double t = takeInput.nextDouble();

        float answer = obj.calculateMSpeed(m, t);
        System.out.println("Roo-mean-Square speed of a gass molecule :" +answer );

        float round_answer = Math.round(answer*100f)/100f;
        System.out.println("rounded answer: "+ round_answer);

         System.out.print("Category of the speed: ");
         obj.Check(round_answer);
        

    }

    float calculateMSpeed(double m, double t)
    {
        final double r = 8.3144598;
      
         float v_p = (float)Math.sqrt(3*r*t/m)*1000;
    return v_p;
    }


    void Check(float x)
    {
        if(x>=0)
          if(x<=500)
             System.out.println("Slow");
             else 
              if(x<=1000)
                System.out.println("Medium");
                else
                System.out.println("Fast");
    }
}