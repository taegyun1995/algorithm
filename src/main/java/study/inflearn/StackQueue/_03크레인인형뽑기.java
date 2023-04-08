package study.inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class _03크레인인형뽑기 {

    public static void main(String[] args) {
        _03크레인인형뽑기 t = new _03크레인인형뽑기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.print(t.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }

                    board[j][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}