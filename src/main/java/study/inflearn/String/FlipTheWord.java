package study.inflearn.String;

import java.util.Scanner;

public class FlipTheWord {

    public static void main(String[] args) {
        FlipTheWord t = new FlipTheWord();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : t.solution(n, str)) {
            System.out.println(x);
        }
    }

    public String[] solution(int n, String[] str) {
        String[] answer = new String[n];
        for (int i = 0; i < str.length; i++) {
            StringBuffer sb = new StringBuffer(str[i]);
            answer[i] = sb.reverse().toString();
        }


        return answer;
    }
}