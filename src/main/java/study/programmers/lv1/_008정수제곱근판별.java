package study.programmers.lv1;

import java.util.Scanner;

public class _008정수제곱근판별 {

    public static void main(String[] args) {
        _008정수제곱근판별 t = new _008정수제곱근판별();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        return Math.pow((long) Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

}