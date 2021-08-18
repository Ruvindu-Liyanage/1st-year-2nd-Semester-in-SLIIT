class Command
{
    public static void main(String[] args)
    {
        String str1 = args[0];
        String str2 = args[1];


        int f_num = Integer.parseInt(str1);
        int l_num = Integer.parseInt(str2);
        
        Command obj = new Command(); //creating an object

        System.out.println("The nmax is " + obj.Max(f_num,l_num)); //print the answer using method
    }

    int Max(int x, int y)
   { 
       int answer = (x>y)? x: y;
       return answer;
   }

}