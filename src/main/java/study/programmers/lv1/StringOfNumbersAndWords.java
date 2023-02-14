package study.programmers.lv1;

import java.util.Scanner;

public class StringOfNumbersAndWords {

    public static void main(String[] args) {
        StringOfNumbersAndWords t = new StringOfNumbersAndWords();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num.length; i++) {
            s = s.replaceAll(num[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}