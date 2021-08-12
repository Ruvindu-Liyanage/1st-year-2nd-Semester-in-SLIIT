public class Cal_Vol {

    public static void main(String[] args){

        //getting inputs as command line arrguments and fill the values into array index
        String str1 = args[0];
        String str2 = args[1];
        String str3 = args[2];

        //convert the the string values into double using following method
        double height = Double.parseDouble(str1);
        double width = Double.parseDouble(str2);
        double length = Double.parseDouble(str3);

        //calculate the value
        double volume =  height*width*length;

        System.out.println("The volumn of the cube is "+ volume);

    }
    
}
