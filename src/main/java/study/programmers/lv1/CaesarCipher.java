package study.programmers.lv1;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        CaesarCipher T = new CaesarCipher();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        System.out.println(T.solution(s, n));
    }

    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }

        return answer;
    }

}