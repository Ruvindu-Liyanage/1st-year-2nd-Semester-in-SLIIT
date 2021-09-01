class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting inputs from commandline argument
        String str2 = args[1];

        String word = str1; 
        int num = Integer.parseInt(str2); //converting String into integer

        Kasun obj = new Kasun(); //creating an object

        obj.print(word, num); //calling method

    }

    void print(String word, int num)
    {
        for(int i=0; i<num; i++)
        {
            System.out.println(word.toUpperCase());
        }
    }
}