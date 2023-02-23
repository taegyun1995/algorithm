package study.inflearn.String;

import java.util.Scanner;

public class _01문자찾기 {

    public static void main(String[] args) {
        _01문자찾기 t = new _01문자찾기();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(t.solution(s, c));
    }

    public int solution(String s, char c) {
        int answer = 0;
        for (char x : s.toUpperCase().toCharArray()) {
            if (x == Character.toUpperCase(c)) {
                answer++;
            }
        }

        return answer;
    }
}