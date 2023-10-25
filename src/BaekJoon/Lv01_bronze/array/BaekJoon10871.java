package BaekJoon.Lv01_bronze.array;

import java.util.Scanner;

public class BaekJoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            if ( X > v ) {
                sb.append(v+" ");
            }
        }
        System.out.println(sb);
    }
}
