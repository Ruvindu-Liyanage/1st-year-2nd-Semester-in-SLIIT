class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting input from commandline argument

        int num = Integer.parseInt(str1); //converting String into interger

        Kasun obj = new Kasun(); //creating an object
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