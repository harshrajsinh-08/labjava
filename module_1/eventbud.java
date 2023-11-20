package module_1;

/*
The program should get the branding expenses, travel expenses, food
expenses and logistics expenses as input from the user and calculate the total
expenses for an event and the percentage rate of each of these expenses.  */

import java.util.Scanner;

public class eventbud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, t, f, l;
        float total;
        float b2, t2, f2, l2;
        System.out.println("Enter branding expenses");
        b = sc.nextInt();
        System.out.println("Enter travel expenses");
        t = sc.nextInt();
        System.out.println("Enter food expenses");
        f = sc.nextInt();
        System.out.println("Enter logistics expenses");
        l = sc.nextInt();
        total = b + t + f + l;
        System.out.printf("Total expenses : Rs.%.2f\n", total);
        b2 = (b / total) * 100;
        System.out.printf("Branding expenses percentage : %.2f%%\n", b2);
        t2 = (t / total) * 100;
        System.out.printf("Travel expenses percentage : %.2f%%\n", t2);
        f2 = (f / total) * 100;
        System.out.printf("Food expenses percentage : %.2f%%\n", f2);
        l2 = (l / total) * 100;
        System.out.printf("Logistics expenses percentage : %.2f%%\n", l2);

        System.out.printf("%.2f", b2);
    }
}