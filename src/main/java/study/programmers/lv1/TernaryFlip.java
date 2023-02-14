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
        String s = new StringBuilder(s3).reverse().toString();
        int exp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(3, exp);
            exp++;
        }

        return answer;
    }

}
