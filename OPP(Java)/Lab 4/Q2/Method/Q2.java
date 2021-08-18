class Command
{
    public static void main(String[] args)
    {
        String str1 = args[0];
        String str2 = args[1];

        int f_num = Integer.parseInt(str1);
        int l_num = Integer.parseInt(str2);
        
        Command obj = new Command(); //creating an object
        obj.Min(f_num, l_num); //calling the method
    }

    void Min(int x, int y)
   { 
       if(x>y)
         System.out.println("Minimum number is "+y);
          else 
         System.out.println("Minimum number is "+x);
   }
}