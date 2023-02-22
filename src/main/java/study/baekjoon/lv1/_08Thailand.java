package study.baekjoon.lv1;

import java.util.Scanner;

public class _08Thailand {

    public static void main(String[] args) {
        _08Thailand t = new _08Thailand();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(t.solution(a));
    }

    public int solution(int a) {
        return a - 543;
    }

}