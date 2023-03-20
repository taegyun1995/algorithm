package study.inflearn.String;

import java.util.Scanner;

public class _09숫자만추출 {

    public static void main(String[] args) {
        _09숫자만추출 t = new _09숫자만추출();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        for (char x : chars) {
            if (Character.isDigit(x)) {
                sb.append(x);
            }
        }
        return Integer.parseInt(sb.toString());
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
