import java.io.*;
import java.util.*;

public class Sol1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(); // 소수이면 arraylist에 추가해서 return
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int t, res = 0;
            while (tmp > 0) { // 숫자 뒤집기
                t = tmp % 10;
                res = res * 10 + t; // ex) 1230 => 0, 3, 32, 321
                tmp /= 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) { // 2부터 약수가 있는지 찾기
            if (num % i == 0) return false;
        }
        return true;
    }
}