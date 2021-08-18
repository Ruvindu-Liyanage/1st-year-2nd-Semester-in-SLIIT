import java.util.Scanner;
class Season{
    public static void main(String[] args)
    {
        Season obj = new Season(); //creating an object
        Scanner takeInput = new Scanner(System.in); //creating a method to get inputs
        
        System.out.print("Enter the month = "); //ask for inputs
        int month = takeInput.nextInt(); //get inputs

        obj.Print_detail(month); //calling the method

    }
    void Print_detail(int x)
    {
        if(x==1 || x==2 || x==12)
           System.out.println("This season is Winter");
        else
        if(x==3 || x==4 || x==5)
        System.out.println("This season is Spring");
          else 
          if(x==6 || x==7 || x==8)
          System.out.println("This season is Summer");
          else 
          if(x==9 || x==10 || x==11)
          System.out.println("This season is Autumn");
          
    }
}