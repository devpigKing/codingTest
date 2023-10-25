package BaekJoon.Lv01_bronze.array;

import java.util.Scanner;

public class BaekJoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // N개 입력
        int[] M = new int[N];  // 크기가 N인 배열 M 생성
        int v = sc.nextInt();  // 찾는 정수 v 입력
        int cnt = 0;		       // 카운트 변수 초기화

        for ( int i = 0; i < N; i++) {
            M[i] = sc.nextInt();  // N개의 정수를 배열 M에 채우고
        }

        for ( int i = 0; i < N; i++) {
            if ( v == M[i] ) {  // v와 M[i]가 같으면
                cnt++;  // 카운트 증가
            }
        }
        System.out.println(cnt);  // 출력
    }
}
