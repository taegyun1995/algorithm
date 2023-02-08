package study.programmers.lv1;

import java.util.Scanner;

public class NSpacedByX {

    public static void main(String[] args) {
        NSpacedByX t = new NSpacedByX();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(t.solution(x, n));
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;

        }
        return answer;
    }

}