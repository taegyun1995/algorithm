package study.inflearn.String;

import java.util.Scanner;

public class _06중복문자제거 {

    public static void main(String[] args) {
        _06중복문자제거 t = new _06중복문자제거();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

}
