package BaekJoon.Lv02_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekJoon2839 {
    public static void main(String[] args) {
        /*
        입력
        첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

        출력
        상근이가 배달하는 봉지의 최소 개수를 출력한다.
        만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

        1. 몇 킬로를 받아야 할까?? N을 입력 받는다.
        2.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());

        if(N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 0) {
            System.out.println(N/5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N/5) + 2);
        }

    }
}
