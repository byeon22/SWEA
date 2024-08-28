import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : score) {
            int count = 0;
            for (int y : score) {
                if (x < y) count++; // 나보다 큰 애들이 몇 갠지 count
            }
            sb.append(count+1).append(" "); // count+1한 게 나의 등수
        }

        System.out.println(sb);
    }
}