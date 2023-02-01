package study.programmers.lv1;

import java.util.Scanner;

public class NumberOfFactorsAndAddition {

    public static void main(String[] args) {
        NumberOfFactorsAndAddition T = new NumberOfFactorsAndAddition();
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(T.solution(left, right));
    }

    public int solution(int left, int right) {
//        int answer = 0;
//
//        for (int i = left; i <= right; i++) {
//            int count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count % 2 == 0) {
//                answer += i;
//            } else {
//                answer -= i;
//            }
//        }
//        return answer;

        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }

}