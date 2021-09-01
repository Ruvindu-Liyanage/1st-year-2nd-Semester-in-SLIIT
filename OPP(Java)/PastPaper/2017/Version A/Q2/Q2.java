class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting inputs from commandline argument
        String str2 = args[1];

        int num1 = Integer.parseInt(str1);//converting String into integer
        int num2 = Integer.parseInt(str2); 

        Kasun obj = new Kasun(); //creating an object

        obj.print(num1, num2); //calling method

    }

    void print(int num1, int num2)
    {
        int sum=0;
        for(int i=num1; i<=num2; i++)
        {
         sum = sum + (int)Math.pow(i, 2);
          
        }
        System.out.println("Sum = "+sum);
    }
}