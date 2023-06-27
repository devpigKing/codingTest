package BaekJoon.Lv02_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간합을 구하는 가장 기본적인 문제이다. 잘 익혀두자.
public class baekJoon11659 {
    public static void main(String[] args) throws IOException {
        /*
        문제
        수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

        1 ≤ N ≤ 100,000
        1 ≤ M ≤ 100,000
        1 ≤ i ≤ j ≤ N

        입력
        첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

        출력
        총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

        * 문제에서 수의 개수와, 합을구해야 하는 횟수는 최대 100,000이다. 게다가 구간마다 합을 매번 계산하면 0.5초만에 모든 계산을 할 수가 없다.
        이럴 때 바로 구간 합을 이용해야 한다.

        * S[i] = S[i-1] + A[i]

        * 슈도 코드 작성하기
        suNo(숫자 갯수), quizNo(질의 개수) 저장하기
        for(숫자 개수만큼 반복하기) {
            합 배열 생성하기(S[i] = S[i - 1] + A[i])
            }
        for(질의 개수만큼 반복하기) {
            질의 범위 받기(i ~ j)
            구간 합 출력하기 (S[j] - S[i - 1])
            }
         */

        // 받는 데이터가 많을 때는 bufferedReader를 쓰는게 Scanner보다 더 빠르다.(Scanner 처럼 값을 입력 받는 형식임.)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 한줄에 굉장히 길게 옆으로 데이터가 들어옴 => int형으로 받기 힘듬 => stringTokenizer를 이용해서 값을 받음.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // long형으로 하는 이유는 int형 범위를 넘어가서 오류를 부를 수 있음.
        // 배열은 0 번째 인덱스를 가지기 때문에 1번부터 시작하기 위에 1을 더함.
        long[]S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); // 합 배열 공식 => S[i] = S[i-1] + A[i]
        }
        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}
