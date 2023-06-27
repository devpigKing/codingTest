package BaekJoon.Lv02_silver.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekJoon1940 {
    public static void main(String[] args) throws IOException {
        /*
        문제
        주몽은 철기군을 양성하기 위한 프로젝트에 나섰다. 그래서 야철대장을 통해 철기군이 입을 갑옷을 만들게 하였다.
         야철대장은 주몽의 명에 따르기 위하여 연구에 착수하던 중 아래와 같은 사실을 발견하게 되었다.

        갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다.
        갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다.
        야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다.
        이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다. 그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다.
         그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다. 고유한 번호는 100,000보다 작거나 같은 자연수이다.

        출력
        첫째 줄에 갑옷을 만들 수 있는 개수를 출력한다.


        * 문제 분석하기
        - 시간 복잡도를 고려해보자. 크기를 비교하므로 값을 정렬해보자! N의 최대 범위가 15,000이므로 O(nlogn) 시간 복잡도 알고리즘(정렬 알고리즘)을 사용해도 문제가 없다.
        - 양쪽 끝의 위치를 투 포인터로 지정해 문제에 접근해 본다.

        투 포인터 이동 원칙
        - A[i] + A[j] > M: j--;  // 번호의 합이 M보다 크므로 큰 번호 index를 내린다.
        - A[i] + A[j] < M: i++;  // 번호의 합이 M보다 작으므로 작은 번호 index를 올린다.
        - A[i] + A[j] == M: i++; j--; count++;  // 양쪽 포인터를 모두 이동시키고 count를 증가 시킨다.

         */
        // Scanner 쓰다가 BufferedReader쓰는 이유는 한줄로 숫자를 빠른 입출력하기 위해 쓴다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 크기가 N인 배열 선언
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // A배열 오름차순
        int count = 0;
        int i = 0;  //A[0] -> Min
        int j = N-1;  //A[N-1] -> Max

        while (i<j) {
            if(A[i]+A[j] < M) i++;
            else if(A[i] +A[j]>M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);

    }
}
