import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] N = new int[T];
        int[] M = new int[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N[i] = Integer.parseInt(st.nextToken());
            M[i] = Integer.parseInt(st.nextToken());

            int[] a = new int[M[i]];
            int[] b = new int[M[i]];
            // int[] mark = new int[N];
            boolean[] mark = new boolean[N[i]];

            for (int j = 0; j < M[i]; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                a[j] = Integer.parseInt(st.nextToken());
                b[j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(N[i]-1);
        }
    }
}
