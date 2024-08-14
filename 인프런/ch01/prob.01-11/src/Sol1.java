import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        str = str + " "; // 마지막 문자 추가하기 위해서 빈 문자 추가
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) cnt++; // 다음 문자와 비교
            else {
                answer.append(str.charAt(i));
                if (cnt > 1) answer.append(cnt);
                cnt = 1;
            }
        }
        return answer.toString();
    }
}
