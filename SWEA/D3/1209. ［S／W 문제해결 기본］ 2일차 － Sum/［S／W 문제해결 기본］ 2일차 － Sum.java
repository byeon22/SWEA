import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < 10; tc++) {
            br.readLine();
            int max = -1;

            int[][] map = new int[100][100];
            
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int rightSum = 0;
            int leftSum = 0;
            
            for (int i = 0; i < 100; i++) {
                int rowSum = 0;
                int colSum = 0;

                for (int j = 0; j < 100; j++) {
                    rowSum += map[i][j];
                    colSum += map[j][i];
                }
                max = Math.max(max, Math.max(rowSum, colSum));

                rightSum += map[i][i];
                leftSum += map[i][99-i];

                max = Math.max(max, Math.max(rightSum, leftSum));
            }

            sb.append("#").append(tc+1).append(" ").append(max).append("\n");
        }

        System.out.println(sb.toString());
    }
}