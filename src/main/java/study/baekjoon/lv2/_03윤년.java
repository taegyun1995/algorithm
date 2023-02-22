package study.baekjoon.lv2;

import java.util.Scanner;

public class _03윤년 {

    public static void main(String[] args) {
        _03윤년 t = new _03윤년();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
            return 1;
        }
        return 0;
    }

}