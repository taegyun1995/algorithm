package study.programmers.lv1.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _011문자열을정수로바꾸기 {

    public static void main(String[] args) throws IOException {
        _011문자열을정수로바꾸기 t = new _011문자열을정수로바꾸기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        boolean sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-') {
                sign = false;
            } else if (ch != '+') {
                result = result * 10 + (ch - '0');
            }
        }

        return sign ? 1 : -1 * result;
    }

}