package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _003짝수와홀수 {

    public static void main(String[] args) throws IOException {
        _003짝수와홀수 t = new _003짝수와홀수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(t.solution(n));
    }

    public String solution(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

}