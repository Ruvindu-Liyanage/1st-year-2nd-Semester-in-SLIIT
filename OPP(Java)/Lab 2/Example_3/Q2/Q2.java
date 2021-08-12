class StringExpression {
    public static void main (String[] args)
    {
        String str;
        int num1, num2;

        num1 = 12;
        num2 = 26;

        str = "The sum = " + num1 + num2;
        System.out.println(str);

        str = "The sum = " + (num1 + num2);
        System.out.println(str);

        str = num1 + num2 + " is the sum";
        System.out.println(str);

        str = "The sum of " + num1 + " and " + num2 + " = " + (num1+num2); 
        System.out.println(str);
    }
}