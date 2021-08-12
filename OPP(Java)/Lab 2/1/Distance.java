class Convert {
    public static void main(String[] args){

       //declaring two variables as miles and yards and initializing values
        int miles = 26;
        int yards = 385;

        //declaring a double variable as Killometers
        double killometers;
        
        //write an expression to calculate killometers
        double y = ((miles*1.609) + ((yards/1760)*1.609));
    
        //save the result of the above expressing to the variable killometers
        killometers  = y;
    
        //Print the final answer
        System.out.println("The Answer is "+ killometers + "KM");
        
    }
    
}
