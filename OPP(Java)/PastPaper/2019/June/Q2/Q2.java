class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting inputs using commandline arguments
        String str2 =args[1];
 
        double num1 = Double.parseDouble(str1); //converting string into double
        double num2 = Double.parseDouble(str2);

        Kasun obj = new Kasun(); //creating object

        System.out.print("Sum "+ obj.calculate(num1, num2));//print the answer using method

    }

    double calculate(double num1, double num2)
    {
        double sum=0d;

         for(double i= num1; i<=num2; i=i+10)
         {
             sum = sum + Math.atan(i);
        
         }
         return sum;
    }
}