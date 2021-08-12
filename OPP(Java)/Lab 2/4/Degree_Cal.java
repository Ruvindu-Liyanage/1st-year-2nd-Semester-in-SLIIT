class Degree_Cal{

    public static void main(String[] args){
   
    //getting input using command line argument for celsius
    String str1 = args[0];

     //convert the value from command line arrgumet into integer vlaue
    int k = Integer.parseInt(str1);

    //calculate the celsius into Fahrenheit
     int F = 1*k+32;

     System.out.println("The input celsius is "+k);
     System.out.println("Fahrenheit is "+F);

    }



}