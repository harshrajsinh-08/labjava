package module_1;
import java.util.Scanner;

public class first_seclast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int first = x/10000;
        x=x%10000;
        int sec = x/1000;
        x = x%1000;
        int third = x/100;
        x= x%100;
        int fourth = x/10;
        x = x%10;

        System.out.println(first);
        System.out.println(sec);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(x);

        int tot = first+fourth;
        System.out.println("tot = "+tot);
    }
}
