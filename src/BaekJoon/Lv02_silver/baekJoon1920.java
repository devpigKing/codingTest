package BaekJoon.Lv02_silver;

import java.util.Arrays;
import java.util.Scanner;

public class baekJoon1920 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ar = new int[N];

        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        for ( int i = 0; i < M; i++) {

            boolean find = false;
            int start = 0;
            int end = ar.length - 1;
            int target = sc.nextInt();

            while (start <= end) {

                int middle = (start+end)/2;
                int middleValues = ar[middle];

                if(middleValues > target) {
                    end = middle - 1;
                } else if (middleValues < target) {
                    start = middle + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
