package study.baekjoon.lv2;

import java.util.Scanner;

public class _07주사위세개 {

    public static void main(String[] args) {
        _07주사위세개 t = new _07주사위세개();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(t.solution(a, b, c));
    }

    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && a == c && b == c) {
            answer = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            answer = 1000 + (a * 100);
        } else if (b == c) {
            answer = 1000 + (b * 100);
        } else {
            answer = Math.max(a, Math.max(b, c)) * 100;
        }
        return answer;
    }

}