package study.inflearn.String;

import java.util.Scanner;

import static java.lang.Character.*;

public class _02대소문자변환 {

    public static void main(String[] args) {
        _02대소문자변환 t = new _02대소문자변환();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public StringBuilder solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char aChar : s.toCharArray()) {
            if (isUpperCase(aChar)) {
                sb.append(toLowerCase(aChar));
            } else {
                sb.append(toUpperCase(aChar));
            }
        }
        return sb;
    }

}