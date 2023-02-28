package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _09별찍기1 {

    public static void main(String[] args) {
        _09별찍기1 t = new _09별찍기1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (String x : t.solution(n)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            answer.add(sb.toString());
            sb = new StringBuilder();
        }

        return answer;
    }

}