import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = scanner.nextInt();

            int[][] triangle = generatePascalTriangle(n);
            printPascalTriangle(testCase, triangle);
        }

        scanner.close();
    }

    private static int[][] generatePascalTriangle(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; 

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            triangle[i][i] = 1;
        }
        return triangle;
    }

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
