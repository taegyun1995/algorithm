package study.programmers.lv1;

import java.util.Scanner;

public class MakeWeirdCharacters {

    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeWeirdCharacters T = new MakeWeirdCharacters();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }

}