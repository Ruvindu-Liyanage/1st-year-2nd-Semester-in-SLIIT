import java.util.Scanner;

class MeanValue
{
    public static void main(String[] args)
    {

         int num =3 ;//how many number which you want to repeat
         String c= "";
         Calculate(num);
    }




     static void Calculate(int num)
     {
        int answer=0,sum=0;
        String check_Exist;
        Scanner takeInput = new Scanner(System.in);
        
        
            do
            {
                for(int i=0; i<3; i++)

               { System.out.print("Number  :");
                int x = takeInput.nextInt();
    
                sum  = sum + x;            
            }
               
                answer = sum/3;
                System.out.println("The answer is "+ answer);
                sum =0;

                System.out.println("If you want to exist, please type \"Exist\"");
                takeInput.nextLine();
                check_Exist = takeInput.nextLine();
                 takeInput.close();

            }while(check_Exist.equalsIgnoreCase("Exist") !=true);


           


            

       
       
}



}
    

