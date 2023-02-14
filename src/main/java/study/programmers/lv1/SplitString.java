package study.programmers.lv1;

import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        SplitString t = new SplitString();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int diff = 0;
        char[] x = s.toCharArray();
        char c = x[0];
        System.out.println("c = " + c);
        for (int i = 1; i < s.length() - 1; i++) {
            if (c == x[i]) {
                same++;
            } else {
                diff++;
            }
            if (same == diff) {
                answer++;
            }
        }

        return answer;
    }

}