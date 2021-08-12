
import java.util.Scanner;

class Input{

   public static void main(String[] args)
   {
       Scanner takeInput = new Scanner(System.in);

       System.out.println("Enter the Item Name:");
       String name = takeInput.nextLine();
       System.out.println("Enter the Unit Price:");
       int price = takeInput.nextInt();
       System.out.println("Enter the Quantity:");
       int quantity = takeInput.nextInt();

       System.out.println("Total cost will be " + (price*quantity) + " rupees.");
       

   }
   
}
