import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(String.valueOf(c));
            }
        }
        String temp = String.valueOf(sb);
        String reverse = String.valueOf(sb.reverse());

        if (reverse.equals(temp)) return "YES";
        else return "NO";
    }
}