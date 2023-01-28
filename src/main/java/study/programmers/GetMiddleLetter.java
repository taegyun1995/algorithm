package study.programmers;

import java.util.Scanner;

public class GetMiddleLetter {

    public String solution(String s) {
//        String answer = "";
//        char[] c = s.toCharArray();
//
//        if (s.length() % 2 == 0) {
//            char c1 = c[s.length() / 2];
//            char c2 = c[s.length() / 2 - 1];
//            answer = c2 + "" + c1;
//        } else {
//            answer = String.valueOf(c[s.length() / 2]);
//        }
//
//
//        return answer;

//        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);

        int a = s.length();
        String word = "";

        if ( a % 2 == 0 )
            word = s.substring(a / 2 - 1, (a / 2) + 1);
        else
            word = s.substring((a / 2), (a / 2) + 1);

        return word;
    }

    public static void main(String[] args) {
        GetMiddleLetter T = new GetMiddleLetter();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.solution(s));
    }

}