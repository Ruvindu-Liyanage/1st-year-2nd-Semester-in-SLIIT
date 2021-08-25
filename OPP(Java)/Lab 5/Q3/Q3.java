import java.util.Scanner;

class Balance
{
    public static void main(String[] args)
    {
      Scanner takeInput = new Scanner(System.in); 
      Balance obj = new Balance(); // creating a object

      System.out.print("Enter the balance:"); //ask for inputs
      double num = takeInput.nextDouble(); //get inputs
      

     System.out.println("The final balance is "+ obj.Calculate(num)); //print using method

    }

    double Calculate(double num)
    {
        double sum=0d;

        if(num>=10000)
          {
              if(num>=50000)
                 {
                    sum = num + ((num/100)*8);
                 }
                else
                  if(num>=25000)
                  {
                    sum = num + ((num/100)*5);   
                  }
                  else    
                    if(num>=10000)
                       {
                        sum = num + ((num/100)*2); 
                       }
            else
               sum = num+ 0;
          }          
           
 return sum;
        
    }
}