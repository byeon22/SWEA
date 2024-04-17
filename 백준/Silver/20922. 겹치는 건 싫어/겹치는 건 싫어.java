import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        int[] count = new int[100001];

        int a;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int result = 0;

        while (end < N) {
            if (count[list[end]] != K) {
                count[list[end]]++;
                end++;
            }
            else {
                count[list[start]]--;
                start++;
            }

            if (result < end-start) result = end-start;
        }

        System.out.println(result);
    }
}