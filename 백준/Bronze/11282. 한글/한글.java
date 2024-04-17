import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = N/588;
        N = N % 588;

        int b = N/28;
        int c = N%28-1;

        System.out.println((char) ('가' + a*21*28 + b*28 + c));
    }
}