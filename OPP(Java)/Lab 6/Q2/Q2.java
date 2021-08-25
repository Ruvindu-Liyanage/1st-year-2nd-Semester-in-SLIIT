import java.util.Scanner;

class EmpInfor
{
   public static void main(String[] arg)
   {
   String last;
   
       Scanner takeInput = new Scanner(System.in);
     
       do
       {
        
            System.out.println("Enter Employee name:");
            String name = takeInput.nextLine();

            System.out.println("Enter Employee no:");
            int no = takeInput.nextInt();

            System.out.println("Enter Employee Job title:");
            takeInput.nextLine();
            String title = takeInput.nextLine();

            System.out.println("The name is " +name);
            System.out.println("The no is " +no);
            System.out.println("The title is " +title);

            System.out.println("If you need to exist please enter \'Y\' otherwise \'N\' ");
            
            last = takeInput.nextLine();
           

       } while(last.equalsIgnoreCase("Y") == true);
           
}

}