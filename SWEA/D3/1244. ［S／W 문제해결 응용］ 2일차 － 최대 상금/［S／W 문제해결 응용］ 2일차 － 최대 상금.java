import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static String[] number;
    static int max, change;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            number = st.nextToken().split("");
            change = Integer.parseInt(st.nextToken());

            max = 0;

            if (number.length < change)
                change = number.length;

            dfs(0, 0);
            sb.append("#").append(i+1).append(" ").append(max).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int start, int cnt) {
        if (cnt == change) {
            String result = "";
            for (String s : number)
                result += s;
            max = Math.max(max, Integer.parseInt(result));
            return;
        }
        for (int i = start; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                String temp = number[i];
                number[i] = number[j];
                number[j] = temp;

                dfs(i, cnt+1);

                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }
    }
}