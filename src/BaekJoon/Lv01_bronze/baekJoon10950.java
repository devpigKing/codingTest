package BaekJoon.Lv01_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekJoon10950 {
    public static void main(String[] args) throws IOException {
        /*
        문제
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.

        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        각 테스트 케이스마다 A+B를 출력한다.

        1. 첫 줄에는 테스트 케이스 개수가 주어진다.
        2. 한 케이스에는 두 정수가 공백 한 칸으로 구분되어 주어진다.
         */

//        Scanner sc = new Scanner(System.in);
//
//        int c = sc.nextInt();
//
//        int arr[] = new int[c];
//
//        for(int i = 0; i < c; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            arr[i] = a+b;
//        }
//
//        for(int k : arr) {
//            System.out.println(k);
//
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
