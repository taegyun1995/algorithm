package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _10별찍기2 {

    public static void main(String[] args) {
        _10별찍기2 t = new _10별찍기2();
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
            for (int j = n - 1; j >= i; j--) {
                sb.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            answer.add(sb.toString());
            sb = new StringBuilder();
        }

        return answer;
    }

}