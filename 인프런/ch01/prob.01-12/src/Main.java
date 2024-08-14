import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 7;
        int two = 1;
        int sum = 0;
        int[] ascii = new int[n];

        for (int i = 0; i < str.length(); i++) { // count를 7로 두고 n*7을 n만큼 확인할 수 있게
            if (str.charAt(i) == '#') { // 1인 경우
                for (int j = 0; j < count-1; j++) { // 10진수로 변환
                    two *= 2;
                }
                sum += two;
                two = 1;
            }
            count--;
            if (count == 0) { // count로 7번 채웠으면, 다음 암호 탐색할 수 있게 7로 초기화
                count = 7;
                ascii[i/7] = sum; // 암호 하나 저장
                sum = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int x : ascii) {
            sb.append((char) x); // 문자로 변환 후 sb에 저장
        }

        System.out.println(sb.toString());
    }
}