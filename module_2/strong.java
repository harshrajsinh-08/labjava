package module_2;
import java.util.Scanner;

public class strong {

    static int fact(int dig){
        if(dig == 0 || dig == 1){
            return 1;
        }
        else{
        return dig * fact(dig-1);
    }
}

    static boolean strongnum(int n){
        int orgnum = n;
        int sum=0;

        while (n!=0){
            int digg=n%10;
            sum+=fact(digg);
            n=n/10;
        }
        return sum == orgnum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(strongnum(num) == true){
            System.out.println("Strong num");
        }
        else{
            System.out.println("NOT STROJNG");
        }



    }

    
}
