package study.inf.String;

import java.util.Scanner;

public class FlipSpecificWords {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        FlipSpecificWords T = new FlipSpecificWords();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
