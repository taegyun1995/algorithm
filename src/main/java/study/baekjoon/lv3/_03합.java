package study.baekjoon.lv3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _03합 {

    public static void main(String[] args) {
        _03합 t = new _03합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        return IntStream.range(0, n + 1).sum();
    }

}