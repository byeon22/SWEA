// StringBuilder의 reverse() 이용

import java.util.ArrayList;
import java.util.Scanner;

public class Sol1 {
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
            String tmp = new StringBuilder(x).reverse().toString(); // 각 단어를 sb 객체로 만들어줌
            // reverse() 메서드를 이용하고, 다시 toString()으로 String화 시켜야 String 객체로 들어감
            answer.add(tmp);
        }
        return answer;
    }
}
