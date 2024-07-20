import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.next().toLowerCase();
        char ch = sc.next().toLowerCase().charAt(0);

        int count = 0;

        for (char s : src.toCharArray()) {
            if (ch == s) count++;
        }

        System.out.println(count);
    }
}