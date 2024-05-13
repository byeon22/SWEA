import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N;
        int K;
        int[][] board;
        int result;
        int count;

        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            board = new int[N][N];
            result = 0;

            for (int i = 0; i < N; i++) { // 행 입력
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) { // 열 입력
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < board.length; i++) { // 가로 체크
                count = 0;
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 0) { // 현재 위치가 검은색?
                        if (count == K) result++; // 이전까지의 count가 K랑 같음
                        count = 0; // 검은색으로 초기화
                    }
                    else count++;
                }
                if (count == K) result++;
            }

            for (int j = 0; j < board.length; j++) { // 세로 체크
                count = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][j] == 0) { // 현재 위치가 검은색?
                        if (count == K) result++; // 이전까지의 count가 K랑 같음
                        count = 0; // 검은색으로 초기화
                    }
                    else count++;
                }
                if (count == K) result++;
            }

            sb.append("#").append(tc+1).append(" ").append(result).append("\n");
        }

        System.out.println(sb.toString());
    }
}