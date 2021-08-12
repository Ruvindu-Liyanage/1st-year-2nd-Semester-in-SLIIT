import java.util.Scanner;

public class TakeInput {
    
    int x,y;

    public static void main(String[] args){

    TakeInput ruvi = new TakeInput();
    Scanner Kasun = new Scanner(System.in);

    int a,b;
    a = ruvi.x;
    b= ruvi.y;
    
    System.out.print ("Enter the first number");
    a= Kasun.nextInt();

    System.out.print ("Enter the first number");
    b= Kasun.nextInt();

    int z = (a+b);
    System.out.println("The sum of the 2 number is " +z);


    }
    
}
