
package SLIIT;

import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        Q2 obj = new Q2(); //creating an object
        
        System.out.println("Enter the word:"); //ask for inpusts
        String word = takeInput.nextLine(); //getting an input
        System.out.println("Enter the first indext:");
        int m = takeInput.nextInt();
        System.out.println("Enter the secind indext:");
        int n = takeInput.nextInt();
        takeInput.close(); //close scanner
        
        obj.print(word,m,n);//calling the method
    }
    
    void print(String word, int m, int n)
    {
        String new_word = word.substring(m, n);
        System.out.println("The new word is "+ new_word);
    }
   
}
