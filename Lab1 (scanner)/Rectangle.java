import java.util.Scanner;
public class Rectangle{

 	public static void main( String [] args ){
 		double length;
 		double width;

 		Scanner console = new Scanner(System.in);

 		System.out.println("Please enter the length: ");
 		length = console.nextInt();

 		System.out.println("Please enter the width: ");
 		width = console.nextInt() ; 

 		double perimeter = (length*2) + (width*2);
 		double area = length*width;

 		System.out.println("Perimeter is equal to: "+ perimeter);
 		System.out.println("Area is equal to: "+ area);
 	}

 }

