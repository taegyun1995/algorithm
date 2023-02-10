package study.inflearn.String;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        RemoveDuplicateCharacters t = new RemoveDuplicateCharacters();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }

}
