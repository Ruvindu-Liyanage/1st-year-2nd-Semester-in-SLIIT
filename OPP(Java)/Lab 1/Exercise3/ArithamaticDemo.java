/*Write Java program to print the results of adding, subtracting, multiplying, and dividing among two values.
Eg: Take the two values as 15 and 5.
*/

public class ArithamaticDemo{
    public static void main(String[] args){
        int x=15;
        int y=5;

        //the rusult of adding
        System.out.println("\nAdding --->>");
        System.out.println("15+5 =" + (x+y));

         //the rusult of Substracting
         System.out.println("\nSubtracting --->>");
         System.out.println("15-5 =" + (x-y));

        //the rusult of multiplying
        System.out.println("\nMultiplying --->>");
        System.out.println("15*5 =" + (x*y));

         //the rusult of dividing
         System.out.println("\ndividing --->>");
         System.out.println("15/5 =" + (x/y));        

    }
}