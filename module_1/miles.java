package module_1;
/*Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
program that displays the average speed in kilometers per hour. (Note that 1 mile is
1.6 kilometers.) */

import java.util.Scanner;
public class miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hours = 1;
        double min = 40;
        double sec = 35;
        double miles = 24;
        double totkm = miles*1.6;
        double time = (hours*60)+(min)+(sec/(60));
        double avg = totkm/time;
        System.out.println(avg);
        

        double kph = 60 * totkm/time;
        System.out.println(kph);
    }
    
}
