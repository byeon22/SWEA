// 왼쪽, 오른쪽 각자 끝에서부터 시작해서 최소 거리 세기

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : solution(str, t)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;

        // 기준 문자 왼쪽으로부터 떨어진 거리
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        // 기준 문자 오른쪽으로부터 떨어진 거리
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
}