class SumCommand{

    public static void main(String[] args){

        String str1 =args[0]; //getting inputs from commandline argument
        String str2 =args[1];

        int num1 = Integer.parseInt(str1); //converting String into integer
        int num2 = Integer.parseInt(str2);
        double sum =0d;

        for(int i=num1+1 ; i<=num2; i++)
        {
     
                  sum = sum+ Math.cos(i);
              
        }

        System.out.println("Sum = "+sum);
    }
}