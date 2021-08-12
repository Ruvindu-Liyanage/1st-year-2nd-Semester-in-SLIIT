import java.util.*;
class Input{

public static void main(String[] args)
{
    Scanner kasun = new Scanner(System.in); //creating method for getting input
    Input obj1 = new Input();   //creating a new object

    System.out.print("Enter the item name: ");
    String name = kasun.nextLine();
    System.out.print("Enter the Unit price: ");
    int unit = kasun.nextInt();
    System.out.print("Enter the Quantity:");
    int Quantity =  kasun.nextInt();

    
    System.out.println("Total cost will be " + obj1.Calculate(unit,Quantity) + " Rupees."); //print the total using the method of Calculate
}

int Calculate(int x, int y) //create a new method called Calculate in order to find the total
{
   int total = x*y;
   return total;
}

}