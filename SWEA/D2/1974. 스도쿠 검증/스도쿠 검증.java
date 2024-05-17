import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[][] sudoku = new int[9][9];

        for (int tc = 0; tc < T; tc++) {
            int isPassed = 1;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int sum;
            for (int i = 0; i < 9; i++) { // 행 별로 수도쿠 검증
                sum = 0;
                for (int j = 0; j < 9; j++) {
                    sum += sudoku[i][j]; // 한 행에 있는 모든 열 더함
                }
                if (sum != 45) {
                    isPassed = 0;
                    break;
                }
            }

            for (int j = 0; j < 9; j++) { // 열 별로 수도쿠 검증
                sum = 0;
                for (int i = 0; i < 9; i++) {
                    sum += sudoku[i][j]; // 한 행에 있는 모든 열 더함
                }
                if (sum != 45) {
                    isPassed = 0;
                    break;
                }
            }

            for (int i = 0; i <= 6; i += 3) { // 9칸 별로 수도쿠 검증
                for (int j = 0; j <= 6; j += 3) {
                    sum = sudoku[i][j] + sudoku[i][j+1] + sudoku[i][j+2]
                        + sudoku[i+1][j] + sudoku[i+1][j+1] + sudoku[i+1][j+2]
                        + sudoku[i+2][j] + sudoku[i+2][j+1] + sudoku[i+2][j+2];

                    if (sum != 45) {
                        isPassed = 0;
                        break;
                    }
                }
            }

            sb.append("#").append(tc+1).append(" ").append(isPassed).append("\n");
        }

        System.out.println(sb.toString());
    }
}