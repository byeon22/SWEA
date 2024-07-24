import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] words = str.split(" ");

        for (String word : words) {
            int len = word.length();

            if (len > max) {
                max = len;
                answer = word;
            }
        }

        System.out.println(answer);
    }
}
