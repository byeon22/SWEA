import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        char pre = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (pre == str.charAt(i)) count++;
            else {
                if (count > 1) sb.append(pre).append(count);
                else sb.append(pre);
                count = 1;
            }
            pre = str.charAt(i);
        }

        if (count > 1) sb.append(pre).append(count);
        else sb.append(pre);

        System.out.println(sb.toString());
    }
}