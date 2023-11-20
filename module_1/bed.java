package module_1;
import java.util.Scanner;

public class bed {
    public static void main(String args[]) {
        int x, y, z, X, Y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the left bottom vertex:");
        x = sc.nextInt();
        System.out.println("Enter the y-coordinate of the left bottom vertex:");
        y = sc.nextInt();
        System.out.println("Enter the length of a side:");
        z = sc.nextInt();
        X = x + z / 2;
        Y = y + z / 2;
        System.out.println("The centre of the room is at (" + X + "," + Y + ")");
    }
}