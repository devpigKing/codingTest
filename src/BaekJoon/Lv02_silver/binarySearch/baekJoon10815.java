package BaekJoon.Lv02_silver.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class baekJoon10815 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();
        int B[] = new int[M];

        for (int j = 0; j < M; j++) {
            B[j] = sc.nextInt();
            boolean find = false;
            int start = 0;
            int end = A.length-1;
            int target = B[j];

            while (start <= end) {
                int mid = (start+end)/2;
                int midV = A[mid];

                if ( midV < target) {
                    start = mid+1;
                } else if ( midV > target) {
                    end = mid - 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }



    }
}
