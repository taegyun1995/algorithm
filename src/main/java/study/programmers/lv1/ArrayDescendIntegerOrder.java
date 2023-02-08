package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendIntegerOrder {

    public static void main(String[] args) {
        ArrayDescendIntegerOrder t = new ArrayDescendIntegerOrder();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return Long.parseLong(sb.reverse().toString());
    }

}