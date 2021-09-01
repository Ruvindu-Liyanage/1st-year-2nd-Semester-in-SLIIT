import java.util.Scanner;

class Kasun
{
    public static void main(String[] args)
    {
      Scanner takeInput = new Scanner(System.in);
      Kasun obj = new Kasun(); //creating an object

      System.out.print("Enter a number :");
      int num = takeInput.nextInt();
        obj.Print(num);  //calling the method

    }

    void Print(int num)
    {
        for(int i=1; i<=num; i++)
          {
              for(int j=1; j<=num; j++)
              {
                  System.out.print("X");
              }
            System.out.println();
          }
    }
}