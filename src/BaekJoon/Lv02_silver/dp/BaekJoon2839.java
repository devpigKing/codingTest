package BaekJoon.Lv02_silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2839 {  // 재귀 함수 사용
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        check(N, 0);

    }

    static void check (int N, int idx) {
        if (N%5 == 0) {
            System.out.println(idx+N/5);
            return;
        }
        if (N<0) {
            System.out.println(-1);
            return;
        }
        check(N-3, idx+1);
    }
}


