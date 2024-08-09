import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split("");
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();

        for (String x : array) {
            if (count[x.charAt(0) - 97] < 1) {
                sb.append(x);
                count[x.charAt(0) - 97]++;
            }
        }

        System.out.println(sb);
    }
}