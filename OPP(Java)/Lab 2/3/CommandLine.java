class Example{

public static void main(String[] args){

 String str1 = args[0];
 String str2  =args[1];
 int length = args.length; //count how many index in the array

 double x = Double.parseDouble(str1);
 int y = Integer.parseInt(str2);

 System.out.println("The first argument is " +x);
 System.out.println("The Second argument is " +y);
 System.out.println("The index of the array  is " +length);

}

}
