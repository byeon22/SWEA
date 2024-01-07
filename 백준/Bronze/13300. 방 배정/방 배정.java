import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] W = new int[6];
        int[] M = new int[6];

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            if (S == 0) W[Y-1]++;
            else M[Y-1]++;
        }

        for (int i = 0; i < 6; i++) {
            if (W[i] % K == 0) {
            	cnt += W[i] / K;
            }
            else {
                while (W[i] % K != 0) {
                    W[i] = W[i] / K;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
        	if (M[i] % K == 0) {
            	cnt += M[i] / K;
            }
        	else {
                while (M[i] % K != 0) {
                    M[i] = M[i] / K;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
