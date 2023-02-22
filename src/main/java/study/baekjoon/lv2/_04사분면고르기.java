package study.baekjoon.lv2;

import java.util.Scanner;

public class _04사분면고르기 {

    public static void main(String[] args) {
        _04사분면고르기 t = new _04사분면고르기();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public int solution(int a, int b) {
        if (0 < a) {
            return 0 < b ? 1 : 4;
        }
        return 0 < b ? 2 : 3;
    }

}