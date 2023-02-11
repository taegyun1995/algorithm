package study.inflearn.String;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        PalindromeString t = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

    public String solution(String str) {
        String s = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(s)) {
            return "YES";
        }
        return "NO";
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