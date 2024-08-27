import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextToken();
        }
        for (String x : arr) {
            StringBuilder temp = new StringBuilder(x);
            int num = Integer.parseInt(temp.reverse().toString()); // sb 이용해서 수 뒤집기
            if (isPrime(num) && num != 1) sb.append(num).append(" ");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(int x) {
        int[] arr = new int[x+1];
        for (int i = 2; i <= x; i++) { // 에라토스테네스 체
            if (arr[i] == 0) {
                for (int j = i*2; j <= x; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        if (arr[x] == 0) return true; // 마지막에 해당 수가 소수인지 체크
        else return false;
    }
}