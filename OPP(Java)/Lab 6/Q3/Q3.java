import java.util.Scanner;

class FindVowel
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        FindVowel obj = new FindVowel(); //cteating an object

        System.out.print("Enter a word: "); //ask for input
        String word = takeInput.nextLine(); //getting an input
        takeInput.close();

        obj.printDetail(word); //calling the method

    }

    void printDetail(String word)
    {
        int count=0;
        int word_A=0, word_E=0,word_I=0,word_O=0,word_U=0;

        for(int i=0; i< word.length(); i++)
        {
            char a = word.charAt(i);
            if(a =='a' || a =='e' || a=='i'|| a=='o'|| a=='u'||a =='A' || a =='E' || a=='I'|| a=='O'|| a=='U')
               {
                   if(a== 'a' || a=='A')
                     {
                        word_A++;
                     }
                    if(a=='e' || a=='E')
                    {
                        word_E++;
                    }
                    if(a=='i' || a=='I')
                    {
                        word_I++;
                    }

                    if(a=='o' || a=='O')
                    {
                        word_O++;
                    }
                    if(a=='u' || a=='U')
                    {
                        word_U++;
                    }

                   
               }
        }


        System.out.println("Word :" +word);

        // print the vowel table
       System.out.println("\n*******COUNT TABLE**********\n");

        System.out.println("Total vowel letter is "+ (word_A+word_E+word_I+word_O+word_U));
        
        
        System.out.print("a ");
        for(int i=0; i<word_A; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("e ");
        for(int i=0; i<word_E; i++)
        {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("i ");
        for(int i=0; i<word_I; i++)
        {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("o ");
        for(int i=0; i<word_O; i++)
        {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("u ");
        for(int i=0; i<word_U; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    

    }
}