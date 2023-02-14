package study.baekjoon.lv1;

import java.util.Scanner;

public class Surprised {

    public static void main(String[] args) {
        Surprised t = new Surprised();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public StringBuilder solution(String s) {
        return new StringBuilder(s).append("??!");
    }

}