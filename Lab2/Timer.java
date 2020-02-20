package timer;

import java.util.*;

public class Timer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");

        int totalSeconds = in.nextInt();

        int modSeconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        System.out.print(totalMinutes + ":" + modSeconds);
        System.out.print("\n");
    }
}
