package BaekJoon.Lv01_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2747 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        int temp1 = 1;
        int temp2 = 1;

        for (int i = 2; i <= N; i++) {
            temp2 = temp + temp1;
            temp = temp1;
            temp1 = temp2;
        }
        System.out.println(temp2);


    }
}
