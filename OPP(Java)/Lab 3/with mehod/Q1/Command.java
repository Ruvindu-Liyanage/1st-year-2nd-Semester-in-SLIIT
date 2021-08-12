class ConvertMoney{

    public static void main(String[] args)
    {
        String str1 = args[0];
        String str2 = args[1];
        String str3 = args[2];

        double Input1 = Double.parseDouble(str1);
        double Input2 = Double.parseDouble(str2);
        double Input3 = Double.parseDouble(str3);

        double Doller = Math.round((((Input1/129.26)*100)/100.00));
        double Pound = Math.round((((Input2/132.74)*100)/100.00));
        double Euro = Math.round((((Input3/206.36)*100)/100.00));
  
        ConvertMoney obj = new ConvertMoney();
        obj.printDetail(Input1,Input2,Input3,Doller,Pound,Euro);
    }

    void printDetail(double Input1, double Input2, double Input3, double a, double b, double c)
    {
        System.out.println(Input1 + "LKR = " + a + " $");
        System.out.println(Input2 + "LKR = " + b + " Pounds");
        System.out.println(Input3 + "LKR = " + c + " Euros");

    }

}