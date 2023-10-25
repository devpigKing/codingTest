package BaekJoon.Lv01_bronze.array;

import java.util.Scanner;

public class BaekJoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for ( int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for ( int i = 0; i < N; i++) {
            if ( min > array[i] ) {
                min = array[i];
            }
        }

        int max = array[0];
        for ( int i = 0; i < N; i++) {
            if ( max < array[i] ) {
                max = array[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
