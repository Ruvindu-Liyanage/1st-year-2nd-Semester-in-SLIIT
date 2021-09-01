class Kasun
{
    public static void main(String[] args)
    {
        String str1 = args[0]; //getting input from commandline argument
        String str2 = args[1];

        int a = Integer.parseInt(str1); //converting String into interger
        int s = Integer.parseInt(str2);

        Kasun obj = new Kasun(); //creating an object
        System.out.println("Side of the pentagon: "+ a +"cm");
        System.out.println("Apothem length: "+ s +"cm");
        System.out.print("The area of the pentagon is " + obj.area(a, s) );

    }

    int area(int a, int s)
    {
       int area = s*a*5/2;
    return area;
    }
}