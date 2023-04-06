package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class _006나머지가1이되는수찾기 {

    public static void main(String[] args) throws IOException {
        _006나머지가1이되는수찾기 t = new _006나머지가1이되는수찾기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(t.solution2(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 3; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public int solution2(int n) {
        return IntStream.range(2, n)
                        .filter(i -> n % i == 1)
                        .findFirst()
                        .orElse(0);
    }

}