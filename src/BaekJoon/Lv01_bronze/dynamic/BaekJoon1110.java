package BaekJoon.Lv01_bronze.dynamic;

import java.util.Scanner;

public class BaekJoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int equal = N;
        int cnt = 0;

        while (true) {
            N = ((N%10)*10) + (((N/10) + (N%10)) %10);
            cnt++;

            if ( equal == N ) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
