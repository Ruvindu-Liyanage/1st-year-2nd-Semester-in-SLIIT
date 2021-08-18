import java.util.Random; //import a inbild calss called Random
import java.util.Scanner;
class Random_num
{
    public static void main(String[] args)
    {
        int number =5; //how many numbers which are needed to random
        Random_num obj = new Random_num(); //creating an object
        obj.genRandom(number); //invoking using genRandam method
    }
    void genRandom(int x)
    {
        for(int i=0; i<x; i++)
        {
            Random rnd = new Random(); //create an object for Random class
            System.out.println(1 + rnd.nextInt(100)); //print the result
        }
    }
}

