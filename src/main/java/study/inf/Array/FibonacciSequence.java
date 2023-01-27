package study.inf.Array;

import java.util.Scanner;

public class FibonacciSequence {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 1; i < n - 1; i++) {
            answer[i + 1] = answer[i] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        FibonacciSequence T = new FibonacciSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
