import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            change(i, n);
        }

        br.close();
    }

    private static void change(int testCase, int n) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] count = new int[8];

        for (int i = 0; i < money.length; i++) {
            count[i] = n / money[i];
            n %= money[i];
        }

        System.out.print("#" + testCase + "\n");
        for (int i = 0; i < money.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
    }
}
