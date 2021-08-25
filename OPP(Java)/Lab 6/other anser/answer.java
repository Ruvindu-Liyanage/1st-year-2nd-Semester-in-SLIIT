import java.util.Scanner;
class q4 {

    public static void main(String[] args) {
        String name=null;
        int quantity;
        double price=0.0;
        double tot=0.0,totalPrice=0.0;
        String ans;
        Scanner inputs=new Scanner(System.in);
        do
        {
           
            System.out.print("Enter Item name : ");
            name=inputs.nextLine();
            System.out.print("Enter quantity : ");
            quantity=inputs.nextInt();
            System.out.print("Enter unit price :");
            price=inputs.nextFloat();
            tot=quantity*price;
            System.out.println("Item name : "+name);
            System.out.println("cost : "+tot);
            System.out.println("Do you want to continue?  (Yes or No)");
            inputs.nextLine();
            ans=inputs.nextLine();                     
            totalPrice+=tot;           
        }while(ans.equalsIgnoreCase("yes")==true);
        System.out.println("Total amount : "+totalPrice);
        inputs.close();
    }
}
