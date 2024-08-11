import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) System.out.println("YES");
        else System.out.println("NO");
    }
}