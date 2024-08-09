// left & right 바꾸는 방법

import java.util.ArrayList;
import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer;
        char[] s = str.toCharArray(); // 문자 교환을 위해 String에서 char 배열로 변환
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++; // Character 클래스의 isAlphabetic으로 알파벳인지 확인
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }
}