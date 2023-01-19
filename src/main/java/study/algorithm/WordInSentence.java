package study.algorithm;

import java.util.Scanner;

public class WordInSentence {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
//        첫 번째 방법
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }

//      두 번째 방법
        while ((pos = str.indexOf(' ')) != -1 ) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        WordInSentence T = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}
