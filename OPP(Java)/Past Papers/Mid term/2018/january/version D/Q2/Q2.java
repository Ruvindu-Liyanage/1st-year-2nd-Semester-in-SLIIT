class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting inputs from commandline arguments
        String str2 = args[1];

        Double num1 = Double.parseDouble(str1); //converting String to double
        Double num2 = Double.parseDouble(str2);   
        
        Kasun obj = new Kasun(); //creating an object
        
        System.out.println("Sum " + obj.calculate(num1, num2) ); //print and call the method

    }

    Double calculate(Double num1, Double num2)
    {
        Double sum=0.0d;
        for(double i=num1+1; i<=num2; i++)
        {
            sum = sum + Math.tan(i);
        }
    return sum;
    }
}
