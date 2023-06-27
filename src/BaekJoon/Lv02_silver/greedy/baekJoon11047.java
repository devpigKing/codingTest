package BaekJoon.Lv02_silver.greedy;

import java.util.Scanner;

public class baekJoon11047 {
    public static void main(String[] args) {
    /*
    문제
    준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

    둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

    출력
    첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
     */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전 종류의 갯수를 입력 받음.
        int K = sc.nextInt(); // 동전으로 만들 합을 입력 받음.

        int A[] = new int[N]; // 동전 종류의 갯수 크기의 배열을 선언함.
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();  // 배열에 N개의 종류별 동전의 크기를 배열에 입력 받음
        }
        int cnt = 0;

        for(int i = N - 1; i >= 0; i--) { // 동전의 크기가 큰 순서부터 차례로 반복문에 돌림
            if(A[i] <= K) {  //현재 동전의 가치가 K보다 작거나 같으면 구성에 추가
                cnt += K/A[i];
                K = K % A[i];
            }
        }
        System.out.println(cnt);

    }
}
