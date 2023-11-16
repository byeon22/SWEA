import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int t = scanner.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            // 각 테스트 케이스의 N 입력
            int n = scanner.nextInt();

            // 파스칼의 삼각형 생성 및 출력
            int[][] triangle = generatePascalTriangle(n);
            printPascalTriangle(testCase, triangle);
        }

        scanner.close();
    }

    // 파스칼의 삼각형 생성
    private static int[][] generatePascalTriangle(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // 각 행의 첫 번째 열은 항상 1

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            triangle[i][i] = 1; // 각 행의 마지막 열은 항상 1
        }
        return triangle;
    }

    // 파스칼의 삼각형 출력
    private static void printPascalTriangle(int testCase, int[][] triangle) {
        System.out.println("#" + testCase);
        for (int[] row : triangle) {
            for (int num : row) {
                if (num != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
