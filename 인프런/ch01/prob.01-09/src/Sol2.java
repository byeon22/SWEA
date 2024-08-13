// Character.isDigit(), String으로 풀기

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) answer += c; // 숫자가 모두 String으로 누적됨
        }

        return Integer.parseInt(answer);
    }
}