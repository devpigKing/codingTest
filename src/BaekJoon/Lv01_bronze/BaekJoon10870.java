package BaekJoon.Lv01_bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fibonacci(N));

    }
    static int fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
