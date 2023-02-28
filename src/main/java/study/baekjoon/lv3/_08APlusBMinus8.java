package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _08APlusBMinus8 {

    public static void main(String[] args) {
        _08APlusBMinus8 t = new _08APlusBMinus8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (String x : t.solution(n, a, b)) {
            System.out.println(x);
        }

    }

    public ArrayList<String> solution(int n, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("Case #");
            sb.append(i + 1).append(": ").append(a[i]).append(" + ").append(b[i]).append(" = ").append(a[i] + b[i]);
            answer.add(sb.toString());
            sb = new StringBuilder();
        }

        return answer;
    }

}