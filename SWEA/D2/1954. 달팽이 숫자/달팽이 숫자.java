import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int N;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int d;
        int row, col;
        int num;
        int[][] snail;

        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());
            snail = new int[N][N];

            d = 0;
            row = 0;
            col = 0;
            num= 1;

            while (num <= N*N) {
                snail[row][col] = num;
                num++;

                if (row + dy[d] >= N || col + dx[d] >= N || row + dy[d] < 0 || col + dx[d] < 0 || snail[row + dy[d]][col + dx[d]] != 0) {
                    d = (d+1)%4;
                }

                row += dy[d];
                col += dx[d];
            }

            sb.append("#").append(tc+1).append("\n");

            for (row = 0; row < N; row++) {
                for (col = 0; col < N; col++) {
                    sb.append(snail[row][col]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}