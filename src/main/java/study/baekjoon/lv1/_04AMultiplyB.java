package study.baekjoon.lv1;

import java.util.Scanner;

public class _04AMultiplyB {

    public static void main(String[] args) {
        _04AMultiplyB t = new _04AMultiplyB();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public int solution(int a, int b) {
        return a * b;
    }

}