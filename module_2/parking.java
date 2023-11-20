package module_2;

import java.util.Scanner;

public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] parkinglot = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                parkinglot[i][j] = sc.nextInt();
            }
        }

        int maxoneinrows = -1;
        int index = -1;

        for (int i = 0; i < R; i++) {
            int onecount = 0;
            for (int j = 0; j < C;j++) {
                onecount += parkinglot[i][j];
            }
            if(onecount>maxoneinrows){
                maxoneinrows = onecount;
                index = i;
            }
        }
        System.out.println(index);
    }
}