package study.baekjoon.lv3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _04영수증 {

    public static void main(String[] args) {
        _04영수증 t = new _04영수증();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        System.out.print(t.solution(x, a, b));
    }

    public String solution(int x, int[] a, int[] b) {
        int sum = IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
        return sum == x ? "Yes" : "No";
    }

}