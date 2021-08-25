import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Year
{
    public static void main(String[] args)
    {
    
      Scanner takeInput = new Scanner(System.in);
      Year obj = new Year();   //creating an object
      int year_no=0;

      System.out.print("Enter a year between 1800 and 3000:"); //ask for inputs
      int num = takeInput.nextInt(); //getting an input
      takeInput.close();
      
      if(num>=1800 && num<=3000)  //checking if it is valid or not
         year_no = num;
        else 
          System.out.println("This is an invalid input");


        obj.checkLeap(year_no); //calling the method

}


void checkLeap(int checkYear)
{
    if(checkYear>=1584)
       {
           if((checkYear%400 ==0 || checkYear%4 ==0) && checkYear%100 !=0)
           {
               System.out.println(checkYear + " is a leap year");
           }
           else
           System.out.println(checkYear + " is not a leap year");
       }
}

}