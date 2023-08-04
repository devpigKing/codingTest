package BaekJoon.Lv02_silver.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class baekJoon2805 {
    public static void main(String[] args) {
        // 상근이는 나무 M미터가 필요하다.
        // 나무의 수 N
        // 나무의 높이
        // 나무의 높이를 저장할 배열
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 나무의 수를 입력
        int M = sc.nextInt();   // 집으로 가져가는 나무의 길이 M

        int A[] = new int[N];   // 각 나무들의 높이를 저장할 배열

        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();   // 나무의 높이를 입력 받음.

            if (max < A[i] ) {
                max = A[i];
            }
        }

//        Arrays.sort(A);   // 정렬



            while (min < max) {
                int middle = (min + max) / 2;
                int sum = 0;

                for (int height : A) {
                    if (height - middle > 0) {
                        sum += (height - middle);
                    }
                }

                if ( sum < M ) {
                    max = middle;
                } else {
                    min = middle + 1;
                }

            }

        System.out.println(min - 1);



    }
}
