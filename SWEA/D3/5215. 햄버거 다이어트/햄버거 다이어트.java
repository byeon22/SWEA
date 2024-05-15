import java.io.*;
import java.util.*;

public class Solution {
    static int[] cal, score;
    static int N, L, max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            max = 0;
            cal = new int[N];
            score = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                score[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0, 0);
            sb.append("#").append(tc + 1).append(" ").append(max).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int cnt, int calSum, int scoreSum) {
        if (calSum > L) return;
        if (cnt == N) {
            if (calSum <= L) max = Math.max(max, scoreSum);
            return;
        }
        dfs(cnt + 1, calSum + cal[cnt], scoreSum + score[cnt]);
        dfs(cnt + 1, calSum, scoreSum);
    }
}