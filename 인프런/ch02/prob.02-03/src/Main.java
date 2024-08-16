import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if ((a[i] == 2 && b[i] == 1) || (a[i] == 1 && b[i] == 3) || (a[i] == 3 && b[i] == 2)) sb.append("A\n");
            else if ((a[i] == 1 && b[i] == 2) || (a[i] == 3 && b[i] == 1) || (a[i] == 2 && b[i] == 3)) sb.append("B\n");
            else sb.append("D\n");
        }

        System.out.println(sb);
    }
}