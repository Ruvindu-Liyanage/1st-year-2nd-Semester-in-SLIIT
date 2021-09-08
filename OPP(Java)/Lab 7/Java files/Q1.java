
package SLIIT;

import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) 
    {
       Scanner takeInput =new Scanner(System.in); 
       Q1 obj = new Q1(); //creating an object
       
        System.out.println("Enter a string:"); //ask for inputs
        String word = takeInput.nextLine(); //getting inputs
        takeInput.close(); //call the method
        obj.print(word); //close taking inputs
    }
   void print(String word)
   {
       for (int i = 0; i < word.length(); i++) 
       {
           System.out.println(word.charAt(i));  
       }
   }
}
