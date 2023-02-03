package study.inflearn.String;

import java.util.Scanner;

public class WordInSentence {

    public static void main(String[] args) {
        WordInSentence t = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (String x : str.split(" ")) {
            if (answer.length() < x.length()) {
                answer = x;
            }
        }

//        int m = Integer.MIN_VALUE, pos;
//        while ((pos = str.indexOf(' ')) != 1) {
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if (len > m) {
//                m = len;
//                answer = tmp;
//            }
//            str = str.substring(pos + 1);
//        }
//        if (str.length() > m) {
//            answer = str;
//        }

        return answer;
    }

}