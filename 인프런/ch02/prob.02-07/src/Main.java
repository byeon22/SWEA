import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] problems = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            problems[i] = Integer.parseInt(st.nextToken());
        }

        int score = 0;
        int result = 0;

        for (int x : problems) {
            if (x == 1) {
                score++;
                result += score; // 점수 늘리고 바로 더하기, 연속이면 늘어난 만큼 더해짐
            }
            else score = 0; // 점수 0으로 초기화
        }

        System.out.println(result);
    }
}