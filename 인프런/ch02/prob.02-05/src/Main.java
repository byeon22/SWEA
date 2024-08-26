// 시간 초과 실패

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) count++;
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0) return false;
        for (int i = 3; i < n; i=i+2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}