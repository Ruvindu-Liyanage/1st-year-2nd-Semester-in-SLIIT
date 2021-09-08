
package SLIIT;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args) 
    {
        Scanner takeInput= new Scanner(System.in);
        Q3 obj = new Q3();   //creating an object
        System.out.println("Enter a word:"); //ask for inputs
        String word = takeInput.nextLine(); //getting an input
        System.out.println("Enter a number:");
        int ch = takeInput.nextInt();
        takeInput.close();//end the scanner 
        
        String answer = obj.delete(word,ch); //call the method
        System.out.println("The word is "+word); //print the input stirng
        System.out.println("After deleteing a char is "+ answer); //pritn the final answer
        
    }
  String delete(String word, int ch)
  {
      StringBuffer b = new StringBuffer(word); //assing StringBuffer
      b.append("hello");
      b.delete(ch, ch+1); //delete a character
      String answer = b.toString(); //convert the strigbuffer into String before return
      return answer;//return the string  value
  }
}
