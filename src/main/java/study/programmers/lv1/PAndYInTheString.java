package study.programmers.lv1;

import java.util.Scanner;

public class PAndYInTheString {

    public static void main(String[] args) {
        PAndYInTheString t = new PAndYInTheString();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        char[] chars = s.toCharArray();
        for (char x : chars) {
            if (x == 'p') {
                p++;
            }
            if (x == 'y') {
                y++;
            }
        }

        return p == y;
    }

    boolean solution2(String s) {
        s = s.toLowerCase();

        return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
    }

}