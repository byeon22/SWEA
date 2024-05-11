import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int[] board;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N;
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());
            board = new int[N];
            result = 0;
            
            countNQueenCase(N, 0);
            sb.append("#").append(tc+1).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static void countNQueenCase(int n, int current) { 
        boolean isPossible; // 퀸을 체스판에 놓을 수 있는지 체크하는 변수

        if (current == n) {
            result++;
            return;
        }

        for (int i = 0; i < n; i++) { // current = 현재 놓으려는 퀸의 행, i = 현재 놓으려는 퀸의 열
            isPossible = true;
            for (int j = 0; j < current; j++) { // j = 이전에 놓은 퀸의 행, board[j] = 이전에 놓은 퀸의 열
                if (board[j] == i || i == board[j] + (current-j) || i == board[j] - (current-j)) { // current-j = 행 차이, i - board[j] = 열 차이
                    // board[j] == i : 이전에 놓은 열과 현재 놓으려는 열이 동일 -> 기각
                    // i == board[j] + (current-j) : 이전에 놓은 퀸의 오른쪽 대각선(아래)에 위치
                    // i == board[j] - (current-j) : 이전에 놓은 퀸의 왼쪽 대각선(아래)에 위치
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                board[current] = i;
                countNQueenCase(n, current+1);
            }
        }
    }
}