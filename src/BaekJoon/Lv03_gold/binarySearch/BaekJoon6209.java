package BaekJoon.Lv03_gold.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon6209 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long d = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] dis = new long[(int) n];

        for (int i = 0; i < dis.length; i++) {
            dis[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(dis);

        
    }
}
