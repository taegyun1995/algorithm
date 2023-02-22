package study.baekjoon.lv2;

import java.util.Scanner;

public class _02시험성적 {

    public static void main(String[] args) {
        _02시험성적 t = new _02시험성적();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(t.solution(a));
    }

    public String solution(int a) {
        if (90 <= a && a <= 100) {
            return "A";
        } else if (80 <= a && a < 90) {
            return "B";
        } else if (70 <= a && a < 80) {
            return "C";
        } else if (60 <= a && a < 70) {
            return "D";
        } else {
            return "F";
        }
    }

}