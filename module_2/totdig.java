package module_2;
import java.util.Scanner;

public class totdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int count = 0;
        while(inp !=0){
            inp= inp/10;
            count +=1;
        }
        System.out.println(count);
    }
    
}
