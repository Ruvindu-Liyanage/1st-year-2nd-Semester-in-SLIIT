import java.util.Scanner;

class CheckIf{

    public static void main(String[] args)
    {
      Scanner takeInput = new Scanner(System.in);
      CheckIf obj = new CheckIf();

      System.out.print("Enter your mark:");
      int num = takeInput.nextInt();

      obj.printResult(num);

    }

    void printResult(int num)
    {
        if(num>=80 && num<=100)
            System.out.println("Distinction");
            if(num>=60 && num<=79)
            System.out.println("Honors");
            if(num>=50 && num<=59)
            System.out.println("Merit");
            if(num>=40 && num<=49)
            System.out.println("Pass");
            if(num>=0 && num<=39)
            System.out.println("Fail");
            if(num<0 && num>100)
            System.out.println("Invalid Value Entered");
    }
}