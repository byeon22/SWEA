import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] array = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if ((x <= 'z' && x >= 'a') || (x <= 'Z' && x >= 'A')) {
                array[i] = '0';
                stack.push(x);
            } else array[i] = x;
        }

        for (char x : array) {
            if (x == '0') sb.append(stack.pop());
            else sb.append(x);
        }

        System.out.println(sb);
    }
}