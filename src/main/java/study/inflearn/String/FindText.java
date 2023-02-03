package study.inflearn.String;

import java.util.Scanner;

public class FindText {

    public static void main(String[] args) {
        FindText t = new FindText();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(t.solution(s, c));
    }

    public int solution(String s, char c) {
        int answer = 0;
        s = s.toUpperCase();
        c = Character.toUpperCase(c);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == c) {
                answer++;
            }
        }

        return answer;
    }
}