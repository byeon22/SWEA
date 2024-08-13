import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return "YES";
    }
}
