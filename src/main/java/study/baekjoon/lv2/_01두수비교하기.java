package study.baekjoon.lv2;

import java.util.Scanner;

public class _01두수비교하기 {

    public static void main(String[] args) {
        _01두수비교하기 t = new _01두수비교하기();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public String solution(int a, int b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else {
            return "==";
        }
    }

}