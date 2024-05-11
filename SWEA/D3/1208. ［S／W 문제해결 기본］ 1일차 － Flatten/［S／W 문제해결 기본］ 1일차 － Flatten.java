import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int dump;
        int[] box;

        for (int tc = 0; tc < 10; tc++) {
            dump = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            box = new int[100];

            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < dump; i++) {
                Arrays.sort(box);
                box[99] -= 1;
                box[0] += 1;
            }

            Arrays.sort(box);

            sb.append("#").append(tc+1).append(" ").append(box[99]-box[0]).append("\n");
        }

        System.out.println(sb.toString());
    }
}