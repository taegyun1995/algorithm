package study.inflearn.Array;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        FibonacciSequence t = new FibonacciSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : t.solution(n)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr;
    }

    public void solution2(int n) {
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

}