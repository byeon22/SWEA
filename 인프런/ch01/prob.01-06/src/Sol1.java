// indexOf 사용

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // 처음 등장하는 인덱스가 어디인지 체크
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) // i는 현재 문자의 위치, 현재 위치랑 처음 나오는 위치랑 동일하면 중복X
                answer += str.charAt(i);
        }

        return answer;
    }
}