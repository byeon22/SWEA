import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum;
        int n = N;

        while (true) {
            if (n < 10) {
                sum = n;
            }
            else {
                sum = n / 10 + n % 10; // 8 14 12 6
            }
            n = (n % 10) * 10 + sum % 10; //68 84 42 26

            cnt++; // 1 2 3 4

            if (n == N) break;
        }

        System.out.println(cnt);

    }

}
