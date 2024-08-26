import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)) System.out.println(x + " ");
    }

    public static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1; // 고정값
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
}
