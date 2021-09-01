class SumCommand{

    public static void main(String[] args)
    {
        String str1 = args[0]; //getting inputs from command line argumets
        String str2 = args[1];

        int num1 = Integer.parseInt(str1); //converting string into int
        int num2 = Integer.parseInt(str2);

        SumCommand obj = new SumCommand();//creating an object 

        obj.print(obj.calculate(num1, num2)); //call the print method using calculate method
    }

    double calculate(int x, int y)
    {
        double sum=0d;
        for(int i=x+1; i<y; i++)
        {
            sum = sum +Math.sin(i);
        }
        return sum;
    }

    void print(double z)
    {
        System.out.println("The sum is : "+z);
    }

}