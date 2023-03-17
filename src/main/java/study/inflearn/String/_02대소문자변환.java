package study.inflearn.String;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class _02대소문자변환 {

    public static void main(String[] args) {
        _02대소문자변환 t = new _02대소문자변환();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (Character.isUpperCase(x)) {
                sb.append(toLowerCase(x));
            } else {
                sb.append(toUpperCase(x));
            }
        }

        return sb.toString();
    }

}