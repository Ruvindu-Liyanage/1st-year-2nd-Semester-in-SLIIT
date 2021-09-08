
package SLIIT;

import java.util.Scanner;

public class Kasun{
    public static void main(String[] args) 
    {
        Scanner takeInput =new Scanner(System.in);
        Kasun obj = new Kasun();
        
        System.out.println("Enter a word:");
        String word = takeInput.nextLine();
        System.out.println();
        
        System.out.println("enter an index number which you want to delete:");
        int d_num = takeInput.nextInt();
        System.out.println("The entered word is "+word);
        System.out.println("After delete the "+d_num+ " Index = "+obj.delete(word, d_num));
        System.out.println();
        
        System.out.println("Enter a word which you want to add:");
        String add_word = takeInput.next();
        System.out.println("The entered word is "+word);
        System.out.println("After adding the word "+ add_word + " into the entered word = "+obj.add(word, add_word));
        System.out.println();
         
        
        System.out.println("Enter a word which you want to replace: ");
        String rep_word = takeInput.next();
        System.out.println("Enter the index nuber which you want to replace:");
        int rep_num = takeInput.nextInt();
        takeInput.close();
        System.out.println("The entered word is "+word);
        System.out.println("After replace the word "+rep_word+" into the enteref word = "+obj.replace(word, rep_word, rep_num));     
             
    }
    
    String delete(String word, int d_num)
    {
     StringBuffer x= new StringBuffer(word);
     x.delete(d_num, d_num+1);
     String output = x.toString();
     return output;
    }
    
    String add(String word, String add_word)
    {
      StringBuffer x= new StringBuffer(word);
      x.append(add_word);
      String output = x.toString();
      return output;
    }
        
    String replace(String word, String rep_word, int rep_num)
    {
     StringBuffer x = new StringBuffer(word);
     x.replace(rep_num,rep_num ,rep_word);
     String output = x.toString();
     return output;
    }
    
}
