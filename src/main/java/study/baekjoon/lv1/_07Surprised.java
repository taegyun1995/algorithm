package study.baekjoon.lv1;

import java.util.Scanner;

public class _07Surprised {

    public static void main(String[] args) {
        _07Surprised t = new _07Surprised();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public StringBuilder solution(String s) {
        return new StringBuilder(s).append("??!");
    }

}