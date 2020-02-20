package bmicalculator;

import java.util.Scanner;
/**
 *
 * @author Sufiyan Mohammad
 */

public class BmiCalculator {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input weight in pounds: ");
        double weight =console.nextDouble();
        
        System.out.print("\nInput height in feet ");
        double height = console.nextDouble();
        
        double kiloWeight = weight*0.45359237;
        double meterHeight = height*0.3048;
        
        System.out.printf("\nWeight in Kg is: "+ kiloWeight);
        System.out.printf("\nHeight in meters is: "+ meterHeight);
        
        double BMI = kiloWeight / (meterHeight * meterHeight);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
