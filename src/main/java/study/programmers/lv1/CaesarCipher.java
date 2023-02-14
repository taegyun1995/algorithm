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
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) { //a
                answer.append((char) ((ch - 'a' + n) % 26 + 'a'));
            } else if (Character.isUpperCase(ch)) { //A
                answer.append((char) ((ch - 'A' + n) % 26 + 'A'));
            } else {
                answer.append(' ');
            }
        }

        return answer.toString();
    }

}