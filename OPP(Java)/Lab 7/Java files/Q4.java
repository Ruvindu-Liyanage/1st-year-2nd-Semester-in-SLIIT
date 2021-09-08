
package SLIIT;

import java.util.Scanner;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner takeInput = new Scanner(System.in);
        Q4 obj = new Q4(); //creating an object
        
        System.out.println("Enter your name:"); //ask for inputs
        String name = takeInput.nextLine(); //getting input
        System.out.println(obj.delete(name));//call the method and print the final answer
    }
    
    String delete(String name)
    {
     int word_length = name.length(); //getting the length of the entered word
     int index = name.indexOf(" "); //find the index of between two word(" ")
     
     StringBuffer x = new StringBuffer(name); //create StringBuffer 
     x.delete(1, word_length); //getting only first letter as first Initial
     String first_word = x.toString(); //convert into String
     
     StringBuffer y = new StringBuffer(name); //create StringBuffer
     y.delete(0, index+1); //getting the second word using delete method of fist word
     String second_word = y.toString();//convert into String
     
     String last = first_word + " " +second_word; //get name with initials
     return last.toUpperCase(); //return and convert into Upper Case
    }
}
