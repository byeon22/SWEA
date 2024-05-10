import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] building;
        int min;
        int result;
        int first;
        int second;
        int third;
        int fourth;

        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            building = new int[N];
            result = 0;

            for (int j = 0; j < N; j++) {
                building[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 2; j <= N-3; j++) {
                min = Integer.MAX_VALUE;
                first = building[j] - building[j-2];
                second = building[j] - building[j-1];
                third = building[j] - building[j+1];
                fourth = building[j] - building[j+2];

                if (first < 0 || second < 0 || third < 0 || fourth < 0) continue;
                if (first < min) min = first;
                if (second < min) min = second;
                if (third < min) min = third;
                if (fourth < min) min = fourth;

                result += min;
            }

            sb.append("#").append(i+1).append(" ").append(result).append("\n");
        }

        System.out.println(sb.toString());
    }
}