import java.util.Scanner;
public class CurrencyConverter{

 	public static void main( String [] args ){
 		double initialValue;
		double usdConstant = 0.76;
		double eurConstant = 0.68;

 	
 		Scanner console = new Scanner(System.in);

 		System.out.println("Please enter the value of CAD you would like to convert to EUR and USD: ");
 		initialValue = console.nextInt();

 		double usdCad = initialValue * usdConstant;
 		double eurCad = initialValue * eurConstant;
 		
 		System.out.println(initialValue+" is equal to "+ usdCad+" USD"+ "and"+ eurCad+"EUR");

 	}

 }