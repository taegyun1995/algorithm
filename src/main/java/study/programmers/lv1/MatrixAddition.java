package study.programmers.lv1;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        MatrixAddition T = new MatrixAddition();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j] = sc.nextInt();
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(arr1, arr2));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

}
