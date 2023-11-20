package module_2;
import java.util.Scanner;

public class cruise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] diff = new int[t];
        for (int i = 0; i < t; i++) {
            int enter = sc.nextInt();
            int exit = sc.nextInt();
            diff[i] = enter - exit;
        }

        int maxGuests = findMaxGuests(diff);

        System.out.println("Maximum number of guests present at any given instance: " + maxGuests);
    }

    static int findMaxGuests(int[] guestsDifference) {
        int maxGuests = 0;
        int currentGuests = 0;

        for (int difference : guestsDifference) {
            currentGuests += difference;

            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
            }
        }

        return maxGuests;
    }
}
