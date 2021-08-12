
import java.util.Scanner;

class Input{

   public static void main(String[] args)
   {
       Scanner takeInput = new Scanner(System.in);

       System.out.println("Enter the weight of a person:");
       int weight = takeInput.nextInt();
       System.out.println("Enter the number of people:");
       int no = takeInput.nextInt();
 
       int total_Weight = weight*no;
       int difference =  1320 -total_Weight;
       int rest_people = difference/weight;

       System.out.println("There are " + no +" people in the lift by now");
       System.out.println("You can fit more "+ rest_people + " Peopele ");
       

   }
   
}
