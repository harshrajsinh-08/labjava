package module_2;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next().toLowerCase();
        if(inp.equals("e")){
            System.out.println("Early bird");
        }
        else if(inp.equals("d")){
            System.out.println("Dsicount ticket");
        }
        else if(inp.equals("v")){
            System.out.println("VIP ");
        }
        else if(inp.equals("s")){
            System.out.println("Standard");
        }
        else{
            System.out.println("Hell");
        }
    }
    
}
