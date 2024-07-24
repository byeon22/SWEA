import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] words = str.split(" ");
        int pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if (str.length() > max) answer = str;

        System.out.println(answer);
    }
}
