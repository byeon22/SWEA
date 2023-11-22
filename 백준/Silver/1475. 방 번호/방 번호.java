import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int roomNum = Integer.parseInt(br.readLine());

        int[] mark = new int[10];

        findNumbers(roomNum);

        for (int i = 0; i < nums.size(); i++) {
            sb.append(nums.get(i));
            for (int j = 0; j < mark.length; j++) {
                if (nums.get(i) == j) { // 0~9 사이에 있음
                    mark[j]++;
                }
            }
        }

        if (mark[6] > 1) {
            mark[6] = mark[6]/2 + mark[6]%2;
        }

        if (mark[9] > 1) {
            mark[9] /= 2;
        }

        Arrays.sort(mark);

        System.out.println(mark[9]);
    }

    public static void findNumbers(int roomNum) {
        int i = 0;
        while (roomNum > 0) {
            int n = roomNum%10;
            if (n == 9) n = 6;
            nums.add(i, n);
            i++;
            roomNum /= 10;
        }
    }
}
