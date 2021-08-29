class Command 
{
    public static void main(String[] args)
    {
        String word = args[0]; //geting input using commandline argument

        float count =0f;
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == 'e')//checking how many e in the word
              count++; //counting how many e 
        }

        System.out.println("Number of Charcters in the word :" + count);
        float precentage = (count/word.length())*100; //find the presentage 
        System.out.println("Precentage of charcrter in the word: "+ precentage +"%" );

    }
}