package study.programmers.lv1;

import java.util.Scanner;

public class ConvertStringToInteger {

    public static void main(String[] args) {
        ConvertStringToInteger t = new ConvertStringToInteger();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-') {
                Sign = false;
            } else if (ch != '+') {
                result = result * 10 + (ch - '0');
            }
        }
        return Sign ? 1 : -1 * result;
    }

}