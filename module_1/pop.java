package module_1;
/*Population Problem: Based on the following assumptions, write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
The U.S. Census Bureau projects population based on the following assumptions: – One birth every 7 seconds
– One death every 13 seconds
– One new immigrant every 45 seconds */

import java.util.Scanner;

public class pop{

    static int calc(int birth,int death,int immig){
        int tot = birth - death + immig;
        return tot;
    }
    public static void main(String[] args) {
        int currentPop = 312032486;
        int sec = 365*24*60*60;

        int birth = sec/7;
        int death = sec/13;
        int immig = sec/45;

        int res = currentPop + calc(birth, death, immig);
        System.out.println(res);
        System.out.println(res * 2);


    }
}