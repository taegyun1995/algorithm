package study.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {
        DescendingOrder T = new DescendingOrder();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }

    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for (String a : str)
            answer += a;

        return answer;
    }

}