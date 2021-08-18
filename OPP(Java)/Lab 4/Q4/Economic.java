class Calculate
{
    public static void main(String[] args)
    {
        //getting input using commandline aragument
        String str1 = args[0];
        String str2 = args[1];
        String str3 = args[2];

        double demand_rate = Double.parseDouble(str1);
        double setup_cost = Double.parseDouble(str2);
        double hold_cost = Double.parseDouble(str3);
        
        //create an object called obj
        Calculate obj = new Calculate();

        //print the value of EOQ using the method called cal_EOQ
        System.out.println("EOQ = " + obj.Cal_EOQ(demand_rate,setup_cost,hold_cost) );
        //print the value of EOQ using the method called cal_TBO
        System.out.println("TBO = " + obj.Cal_TBO(demand_rate,setup_cost,hold_cost) );


   }
   //create a new method to calculate the value EOQ
   double Cal_EOQ(double d_rate, double s_cost, double h_cost)
   {
       double EOQ =  Math.round( (Math.sqrt((2*d_rate*s_cost)/h_cost)*100)/100);
       return EOQ;
   }

     //create a new method to calculate the value TBO
   double Cal_TBO(double d_rate, double s_cost, double h_cost)
   {
       double TBO =  Math.round( (Math.sqrt((2*s_cost)/d_rate*h_cost)*100)/100d) ;
       return TBO;
   } 
}