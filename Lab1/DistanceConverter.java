import java.util.Scanner;
public class DistanceConverter{

 	public static void main( String [] args ){
 		// Declaring the variables
 		// "num1" is the input in from the user in meters and "num2" 
 		// is the constant to multiply "num1" with to convert it to feet.
		double num1;
		double num2 = 3.281;
 	
 		Scanner console = new Scanner(System.in);

 		System.out.println("Please enter the value of meters you would like to convert to feet: ");
 		num1 = console.nextInt();

 		double num3 = num1 * num2;
 		
 		System.out.println(num1+ "m is equal to "+num3+"ft");
 	}

 }