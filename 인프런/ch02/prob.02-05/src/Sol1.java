import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) { // 소수인 경우 (체크가 안된 경우)
                answer++;
                for (int j = i; j <= n; j=j+i) ch[j] = 1; // 배수 체크하기
            }
        }
        return answer;
    }
}
