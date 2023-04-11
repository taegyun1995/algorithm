package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _010정수내림차순으로배치하기 {

    public static void main(String[] args) throws IOException {
        _010정수내림차순으로배치하기 t = new _010정수내림차순으로배치하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(t.solution2(n));
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

    String res = "";

    public long solution2(long n) {
        res = "";
        Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);

        return Long.parseLong(res);
    }

}