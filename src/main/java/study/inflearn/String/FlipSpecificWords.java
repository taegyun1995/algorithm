package study.inflearn.String;

import java.util.Scanner;

public class FlipSpecificWords {

    public static void main(String[] args) {
        FlipSpecificWords t = new FlipSpecificWords();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        char[] chars = s.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while(lt < rt){
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }

}
