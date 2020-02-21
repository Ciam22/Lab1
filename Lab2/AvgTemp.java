package avgtemp;

import java.util.Scanner;

/**
 *
 * @author Sufiyan Mohammad
 */
public class AvgTemp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Asking the different weather.
        System.out.println("What was the weather 3 days ago?: ");
        double weatherDay1 = console.nextDouble();

        System.out.println("What was the wearther 2 days ago?: ");
        double weatherDay2 = console.nextDouble();

        System.out.println("What was the wearther a day ago?: ");
        double weatherDay3 = console.nextDouble();
        //Average weather calculations.
        double avgWeather = (weatherDay1 + weatherDay2 + weatherDay3) / 3;
        System.out.println("The Average weather is: " + avgWeather);
    }

}
