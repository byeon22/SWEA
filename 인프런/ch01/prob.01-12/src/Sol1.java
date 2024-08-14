// substring(), replace(), Integer.parseInt(str, 2) 사용

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }

    public static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2); // 2진수를 10진수로
            str = str.substring(7); // 변환된 부분 날리기
            sb.append(num);
        }

        return sb.toString(); // String 형태로 변환해서 return
    }
}
