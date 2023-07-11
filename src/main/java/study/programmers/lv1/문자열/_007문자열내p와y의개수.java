package study.programmers.lv1.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _007문자열내p와y의개수 {

    public static void main(String[] args) throws IOException {
        _007문자열내p와y의개수 t = new _007문자열내p와y의개수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(t.solution(s));
    }

    boolean solution(String s) {
        int p = 0;
        int y = 0;

        for (char x : s.toLowerCase().toCharArray()) {
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
        s.toLowerCase();

        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }

}