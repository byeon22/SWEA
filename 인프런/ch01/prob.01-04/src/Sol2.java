// left & right 바꾸는 방법

import java.util.ArrayList;
import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }

    public static ArrayList<String> solution(int n , String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray(); // 문자 교환을 위해 String에서 char 배열로 변환
            int lt = 0, rt = x.length()-1; // 왼쪽 끝, 오른쪽 끝에서 시작
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // valueOf()는 static으로 선언된 class 메서드라서 String.으로 접근,
                                            // 문자 배열을 String화 시켜줌ㅇ
            answer.add(tmp);
        }
        return answer;
    }
}
