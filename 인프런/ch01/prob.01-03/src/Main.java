import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] words = new String[100];
        int i = 0;

        while (st.hasMoreTokens()) {
            words[i++] = st.nextToken();
        }

        i = 0;
        int maxIndex = 0;

        while (true) {
            if (words[i] == null) break;
            else if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
            i++;
        }

        System.out.println(words[maxIndex]);
    }
}