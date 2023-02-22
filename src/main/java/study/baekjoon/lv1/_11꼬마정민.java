package study.baekjoon.lv1;

import java.util.Scanner;

public class _11꼬마정민 {

    public static void main(String[] args) {
        _11꼬마정민 t = new _11꼬마정민();
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(t.solution(a, b, c));
    }

    public long solution(long a, long b, long c) {
        return a + b + c;
    }

}