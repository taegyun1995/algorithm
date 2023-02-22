package study.baekjoon.lv1;

import java.util.Scanner;

public class _03AMinusB {

    public static void main(String[] args) {
        _03AMinusB t = new _03AMinusB();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public int solution(int a, int b) {
        return a - b;
    }

}