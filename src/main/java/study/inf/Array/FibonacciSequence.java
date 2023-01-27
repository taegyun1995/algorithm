package study.inf.Array;

import java.util.Scanner;

public class FibonacciSequence {

//    public int[] solution(int n) {
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//        for (int i = 2; i < n; i++) {
//            answer[i] = answer[i - 2] + answer[i - 1];
//        }
//
//        return answer;
//    }

//    public static void main(String[] args) {
//        FibonacciSequence T = new FibonacciSequence();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int x : T.solution(n)) {
//            System.out.print(x + " ");
//        }
//    }

    public void solution(int n) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        FibonacciSequence T = new FibonacciSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
