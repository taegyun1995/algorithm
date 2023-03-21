package study.inflearn.Array;

import java.util.Scanner;

public class _09격자판최대합 {

    public static void main(String[] args) {
        _09격자판최대합 t = new _09격자판최대합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int rowSum = 0;
        int colSum = 0;
        int diag1Sum = 0;
        int diag2Sum = 0;

        for (int i = 0; i < n; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, colSum);
            
            diag1Sum += arr[i][i];
            diag2Sum += arr[i][n - i - 1];
        }

        answer = Math.max(answer, diag1Sum);
        answer = Math.max(answer, diag2Sum);

        return answer;
    }

}