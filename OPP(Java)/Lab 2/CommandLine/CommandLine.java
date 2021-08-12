class Example{

    public static void main(String[] args){

    String str1 = args[0];
    String str2 = args[1];
    String str3 = args[2];
    String str4 = args[3];
    String name = args[4];

    double answer = Double.parseDouble(str1) +Double.parseDouble(str2);
    int answer2 = Integer.parseInt(str3) + Integer.parseInt(str4);

    System.out.println("The answer is "+ answer);
    System.out.println("The answer1 is "+ answer2);
    System.out.println("Welcome "+ name);

    }
}