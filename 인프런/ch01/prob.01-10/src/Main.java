import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        char[] charArray = str.toCharArray();
        ArrayList<Integer> indexNum = new ArrayList<>();
        int count = 0;

        // 찾는 문자가 어디에 있는지 index 위치 저장
        for (char x : charArray) {
            if (x == c) indexNum.add(count);
            count++;
        }

        int distance;

        // 하나씩 돌면서 저장한 index 위치들 중 최소 거리 찾기
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) sb.append("0 ");

            else {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < indexNum.size(); j++) { // 돌면서 index들과의 차 구하기
                    if (indexNum.get(j) < i) {
                        distance = i - indexNum.get(j);
                    } else {
                        distance = indexNum.get(j) - i;
                    }

                    if (distance < min) min = distance; // 최소 거리인지 체크
                }

                sb.append(min).append(" ");
            }
        }

        System.out.println(sb);
    }
}