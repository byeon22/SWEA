// replaceAll()

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(solution(str));
    }
    public static String solution(String s) {
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) return "YES";

        return "NO";
    }
}
