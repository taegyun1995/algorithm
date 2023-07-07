package study.programmers.lv1.수학;

import java.io.IOException;

public class _003짝수와홀수 {

    public static void main(String[] args) throws IOException {
        _003짝수와홀수 t = new _003짝수와홀수();
        int n = 3;
        int n2 = 4;
        System.out.println(t.solution(n));
        System.out.print(t.solution(n2));
    }

    public String solution(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

}