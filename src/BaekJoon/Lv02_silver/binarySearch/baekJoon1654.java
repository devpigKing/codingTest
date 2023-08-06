package BaekJoon.Lv02_silver.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJoon1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int A[] = new int[K];

        long max = 0;

        for ( int i = 0; i < K; i++) {
            A[i] = Integer.parseInt(br.readLine());
            if (max < A[i]) {
                max = A[i];
            }
        }

        max++;

        long start = 0;
        long mid = 0;

        while (start < max) {

            mid = (start + max) / 2;
            long cnt = 0;
            for (int i = 0; i < K; i++) {
                cnt += (A[i]/mid);
            }
            if( cnt < N ) {
                max = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(start - 1);


    }
}
