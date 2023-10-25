package BaekJoon.Lv01_bronze.array;

import java.util.Scanner;

public class BaekJoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        for ( int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int seq = 0;
        for ( int i = 0; i < 9; i++) {
            if ( max < array[i] ) {
                max = array[i];
                seq = i;
            }
        }
        System.out.println(max);
        System.out.println(seq+1);
    }
}
