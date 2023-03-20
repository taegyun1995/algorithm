package study.inflearn.String;

import java.util.Scanner;

public class _10가장짧은문자거리 {

    public static void main(String[] args) {
        _10가장짧은문자거리 t = new _10가장짧은문자거리();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        for (int x : t.solution(s, c)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();
        int len = 1000;

        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == t) {
                len = 0;
            } else {
                len++;
            }
            answer[i] = len;
        }

        len = 1000;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == t) {
                len = 0;
            } else {
                len++;
                answer[i] = Math.min(answer[i], len);
            }
        }

        return answer;
    }

}