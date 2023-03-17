package study.inflearn.String;

import java.util.Scanner;

public class _07회문문자열 {

    public static void main(String[] args) {
        _07회문문자열 t = new _07회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

    public String solution(String str) {
        String s = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(s) ? "YES" : "NO";
    }

    public String solution2(String str) {
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }

}