class Command
{
    public static void main(String[] args)
    {
        String str1 = args[0];
        String str2 = args[1];

        int f_num = Integer.parseInt(str1);
        int l_num = Integer.parseInt(str2);
        
   

       if(f_num>l_num)
         System.out.println("Maximu number is "+l_num);
          else 
         System.out.println("Maximum number is "+f_num);
   }
}