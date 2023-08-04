package BaekJoon.Lv02_silver.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class baekJoon10816 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A); // 이분 탐색을 하기위해선 정렬!

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int B = sc.nextInt();

            sb.append(upperBound(A, B) - lowerBound(A, B)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] A, int B) {
        int lo = 0;
        int hi = A.length;

        while (lo < hi) {
            int mid = (lo + hi) /2;

            if (B <= A[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }


        return lo;
    }

    private static int upperBound(int[] A, int B) {
        int lo = 0;
        int hi = A.length;

        while (lo < hi) {

            int mid = (lo + hi) / 2;

            if (B < A[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }



}
