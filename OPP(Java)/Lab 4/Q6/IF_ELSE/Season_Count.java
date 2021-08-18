import java.util.Scanner;

class Season{
    public static void main(String[] args)
    {
        Season obj = new Season(); //create new object
        Scanner takeInput = new Scanner(System.in); //create a new method for getting inputs
        
        
        System.out.print("Enter the month = "); //ask for getting inputs
        int month = takeInput.nextInt(); //getting inputs

        obj.Print_detail(month); //call the Print_deatail method

    }
    void Print_detail(int x)
    {
        if(x>=1 && x<=12)
        {
            if(x>=3 && x<=5)
            System.out.println("This season is Spring");
              else
              if(x>=6 && x<=8)   
              System.out.println("This season is Summer");
              else
              if(x>=9 && x<=11)
              System.out.println("This season is Autumn");
            else   
            System.out.println("This season is Winter"); 
        }
        else
        System.out.println("This is invalid inputs"); 

    }
}