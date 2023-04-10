package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _007p와y의개수 {

    public static void main(String[] args) throws IOException {
        _007p와y의개수 t = new _007p와y의개수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
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