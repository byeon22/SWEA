// 조건문 나눈 방식이 나랑 좀 다름

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1 {
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

        System.out.println(solution(n, a, b));
    }

    public static String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D\n"; // 비기는 경우
            else if (a[i] == 1 && b[i] == 3) answer+="A\n"; // A가 이기는 3가지 경우
            else if (a[i] == 2 && b[i] == 1) answer+="A\n";
            else if (a[i] == 3 && b[i] == 2) answer+="A\n";
            else answer += "B\n"; // B가 이기는 경우
        }
        return answer;
    }
}
