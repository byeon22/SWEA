import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while (true) {
            if (K == A) break;

            if (K % 2 != 0) {
                K = K - 1;
                cnt++;
            }
            else {
                if (K / 2 < A) {
                    K = K - 1;
                    cnt++;
                }
                else {
                    K = K / 2;
                    cnt++;
                }
            }
        }


        System.out.println(cnt);
        // A + 1
        // A * 2

        // K = 7
        // 77 / 2 = 38 ... 1
        // 38 / 2 = 19

        // K = 1111
        // 997651 / 2 = 498,825 + 1
        // 498,825 / 2 = 249,412 + 1
        // 249,412 / 2 = 124,706
    }
}