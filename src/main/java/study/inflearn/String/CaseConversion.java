package study.inflearn.String;

import java.util.Scanner;

public class CaseConversion {

    public static void main(String[] args) {
        CaseConversion t = new CaseConversion();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public StringBuilder solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char aChar : s.toCharArray()) {
            if (Character.isUpperCase(aChar)) {
                sb.append(Character.toLowerCase(aChar));
            } else {
                sb.append(Character.toUpperCase(aChar));
            }
        }
        return sb;
    }

}
