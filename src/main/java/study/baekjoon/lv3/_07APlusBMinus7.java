package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _07APlusBMinus7 {

    public static void main(String[] args) {
        _07APlusBMinus7 t = new _07APlusBMinus7();
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

    public ArrayList<String>  solution(int n, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int sum = a[i] + b[i];
            sb.append("Case #");
            sb.append(i + 1);
            sb.append(": ");
            sb.append(sum);
            answer.add(sb.toString());
            sb = new StringBuilder();
        }

        return answer;
    }

}