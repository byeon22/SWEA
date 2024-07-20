import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        StringBuilder sb = new StringBuilder();


        for (char x : src.toCharArray()) {
            if (x >= 'A' && x <= 'Z') x += 32; // 풀이1: Character.isLowerCase() Character 클래스의 메소드 이용해도 됨
            else x -= 32;
            sb.append(x);
        }

        System.out.println(sb);
    }
}