import java.util.*;
class ReadConsole {  
public static void main(String[] args) 
{  
Scanner scanner = new Scanner(System.in); //creating a method to get inputs using Scanner class
ReadConsole obj = new ReadConsole(); //creating the object

System.out.print("Enter your full name: ");  
String name = scanner.nextLine();         
System.out.print("Enter your Zodiac sign: ");  
String zodiac = scanner.next();         
System	.out.print("Enter your weight (kg): ");  
double weight = scanner.nextDouble();          
System.out.print("Enter your lucky number: ");  
int luckyNum = scanner.nextInt(); 
  

obj.PrintDetail(name, zodiac, weight, luckyNum); //calling the method 

}

void PrintDetail(String a, String b, double c, int d) //creating a new method to print details
{
System.out.println("Hello, " + a + ".");  
System.out.println("Your lucky number is  " + d + ".");  
System.out.println("You weigh " + c + " kg.");  
System.out.println("Your Zodiac sign is " + b + ".");  
}

}  
