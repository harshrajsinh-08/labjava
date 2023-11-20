package module_1;
import java.util.Scanner;

public class sumofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.next().charAt(0);

        if(a<200){
            System.out.println(a+b);
        }
        else{
            System.out.println("invalid");
        }
    }
    
}
