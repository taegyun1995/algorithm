package study.inflearn.String;

import java.util.Scanner;

public class ExtractOnlyNumbers {

    public static void main(String[] args) {
        ExtractOnlyNumbers t = new ExtractOnlyNumbers();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution2(s));
    }

    public int solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (char x : chars) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public int solution2(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }


}
