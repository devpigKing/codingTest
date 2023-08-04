package BaekJoon.Lv01_bronze;

import java.util.Scanner;

public class baekJoon2775 {
    public static void main(String[] args) {

        // k층 n호 = (k-1)층 1호 + (k-1)층 2호 + ... + (k-1)층 n호

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int A[][] = new int[15][15];

        for (int i = 0; i < 15; i++) {
            A[i][1] = 1;
            A[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                A[i][j] = A[i][j - 1] + A[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(A[k][n]);
        }
    }
}
