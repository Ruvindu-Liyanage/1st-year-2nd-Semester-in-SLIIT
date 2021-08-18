class Randam_Num {
    public static void main(String[] args)
    {
    int number =5;//how many nubmers which is needed to print
    Randam_Num obj = new Randam_Num(); //creating an ojbect
    obj.genRandom(number); //invoking genRandom() method
    }
    
    void genRandom(int x) //creating a method to print randam numbers
    {
        for(int i=0; i<=x; i++)
        {
            int ran = 1 + (int) (Math.random()*100);
            System.out.println(ran);
        }
    }
}
