package BaekJoon.Lv02_silver.twoPointer;

import java.util.Scanner;

public class baekJoon2018 {
    public static void main(String[] args) {
        /*
        문제
        어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서,

        이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.

        예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.

        N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.


        입력
        첫 줄에 정수 N이 주어진다.

        출력
        입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오.

        **문제 해결 전략.
        투 포인터(2개의 포인터로 알고리즘의 시간 복잡도를 최적화한다.)

        이 문제는 시간 복잡도 분석으로 사용할 알고리즘의 범위부터 줄여야 한다.
        N의 최댓 값이 너무 크다. => O(nlogn)의 시간 복잡도 알고리즘을 사용하면 제한 시간을 초과한다. => O(n)의 시간 복잡도 알고리즘을 사용해야 한다.
        => 투 포인터가 있다.

        1. 시작 인덱스와 종료 인덱스를 지정하여 연속된 수를 표현한다. 종료 인덱스를 투 포인터로 지정한 후 문제에 접근해보자.

        **투 포인터 이동 원칙
        - sum > N : sum = sum - start_index; start_index++;
        - sum < N : end_index++; sum = sum + end_index;
        - sum == N : end_index++; sum = sum + end_index; count++;


        * 슈도 코드 작성
        N 변수 저장
        사용 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)  // 자기 자신을 미리 계산하므로 count = 1로 시작함.
        while(end_index != N) {
            if(sum == N) count 증가, end_index 증가, sum 값 변경
            else if(sum > N) sum 값 변경, start_index 증가
            else if(sum < N) end_index 증가, sum 값 변경
            }
        count 출력하기
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if(sum==N) {
                count++;
                end_index++;
                sum = sum + end_index;
            }else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            }else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);

    }
}
