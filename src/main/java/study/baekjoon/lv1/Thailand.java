package study.baekjoon.lv1;

import java.util.Scanner;

public class Thailand {

    public static void main(String[] args) {
        Thailand t = new Thailand();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(t.solution(a));
    }

    public int solution(int a) {
        return a - 543;
    }

}