import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= B; i++) {
            for (int j=1; j<=i; j++) {
                list.add(i);
            }
        }

        int index = A - 1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(index++);
            if (index == B) break;
        }

        sb.append(sum);
        //        pw.println(sb);
        //        pw.close();
        System.out.println(sb);
    }
}
