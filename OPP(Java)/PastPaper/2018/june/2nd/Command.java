class SumCommand{

    public static void main(String[] args){

        String str1 =args[0];
        String str2 =args[1];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        double sum =0d;

        for(int i=num1; i<=num2; i++)
        {
            if(i%2==0)
              {
                  sum = sum+ Math.pow(i,2);
              }
        }

        System.out.println("Sum = "+sum);
    }
}