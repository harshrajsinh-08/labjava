package module_2;
import java.util.Scanner;

public class agever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<15){
            System.out.println("CHILD");
        }
        else{
            System.out.println("Adult");
        }
    }
    
}
