package study.programmers.lv1.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _008정수제곱근판별 {

    public static void main(String[] args) throws IOException {
        _008정수제곱근판별 t = new _008정수제곱근판별();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        return Math.pow((long) Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

}