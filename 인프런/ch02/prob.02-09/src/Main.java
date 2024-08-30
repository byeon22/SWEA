import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sum = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j]; // 각 행의 합 구하기
            }
            if (sum > max) max = sum;
        }

        // 각 열의 합 구하기
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (sum > max) max = sum;
        }

        // 드 대각선의 합 구하기
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }

        if (sum > max) max = sum;

        sum = 0;
        for (int i = n-1; i >= 0; i--) {
            sum += arr[i][i];
        }

        if (sum > max) max = sum;

        System.out.println(max);
    }
}