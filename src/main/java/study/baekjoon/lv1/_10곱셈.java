package study.baekjoon.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class _10곱셈 {

    public static void main(String[] args) {
        _10곱셈 t = new _10곱셈();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (Integer x : t.solution(a, b)) {
            System.out.println(x);
        }
    }

    public ArrayList<Integer> solution(int a, int b) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] str = new StringBuilder(String.valueOf(b)).reverse().toString().split("");
        for (String x : str) {
            answer.add(a * Integer.parseInt(x));
        }
        answer.add(a * b);
        return answer;
    }

}