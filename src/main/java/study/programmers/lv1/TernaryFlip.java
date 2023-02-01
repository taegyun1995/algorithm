package study.programmers.lv1;

import java.util.Scanner;

public class TernaryFlip {

    public static void main(String[] args) {
        TernaryFlip T = new TernaryFlip();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }

    public int solution(int n) {
        int answer = 0;
        String s3 = Integer.toString(n, 3);
        String string = new StringBuilder(s3).reverse().toString();
        System.out.println("string = " + string);
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            int aChar1 = aChar;
            System.out.println("parseInt = " + aChar1);
        }

        return answer;
    }

}
