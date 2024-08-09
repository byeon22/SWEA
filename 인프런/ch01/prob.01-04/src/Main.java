import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            revert(str);
        }

        System.out.println(sb);
    }

    static void revert(String word) {
        Stack<String> stack = new Stack<>();
        String[] words = word.split("");
        for (String x : words) {
            stack.push(x);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.append("\n");
    }
}