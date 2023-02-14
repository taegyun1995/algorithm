package study.baekjoon;

import java.util.Scanner;

public class APlusB {

    public static void main(String[] args) {
        APlusB t = new APlusB();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public int solution(int a, int b) {
        return a + b;
    }

}