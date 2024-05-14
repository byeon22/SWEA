import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
    static int N, M, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        int cheese = 0;
        int time = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) cnt++;
            }
        }

        while (cnt > 0) { // 모두 녹기 한 시간 전에 남아있는 치즈조각이 놓여 있는 칸의 개수를 구해야 함
            cheese = cnt;
            time++;
            visited = new boolean[N][M]; // visited 배열 초기화
            bfs(0, 0);
        }

        System.out.println(time);
        System.out.println(cheese);
    }

    public static void bfs(int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        visited[row][col] = true;
        queue.add(new int[] {row, col}); // 첫 번째 인덱스 큐에 추가

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) { // 동, 남, 서, 북 탐색
                int nowX = dx[i] + now[0];
                int nowY = dy[i] + now[1];

                if (nowX >= 0 && nowX < N && nowY >= 0 && nowY < M && !visited[nowX][nowY]) {
                    visited[nowX][nowY] = true; // 방문 표시
                    if (map[nowX][nowY] == 0) { // 치즈가 아니면
                        queue.add(new int[] {nowX, nowY}); // 큐에 추가해서 치즈가 나올 때까지 탐색
                    } else { // 치즈를 만나면
                        map[nowX][nowY] = 0; // 치즈를 없애줌
                        cnt--; // 치즈 수 감소
                    }
                }
            }
        }
    }
}