import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        int[] k = new int[N];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            k[i] = calc(x[i], y[i], x, y) + 1;
            sb.append(k[i]).append(" ");
        }

        System.out.println(sb);
    }

    public static int calc(int x, int y, int[] N, int[] M) {
        int cnt = 0;

        for (int i = 0; i < N.length; i++) {
            if (x < N[i] && y < M[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}