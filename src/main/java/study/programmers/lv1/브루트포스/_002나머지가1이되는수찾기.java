package study.programmers.lv1.브루트포스;

import java.util.stream.IntStream;

public class _002나머지가1이되는수찾기 {

    public static void main(String[] args) {
        _002나머지가1이되는수찾기 t = new _002나머지가1이되는수찾기();
        int n = 10;
        int n2 = 12;
        System.out.println(t.solution(n));
        System.out.print(t.solution(n2));
    }

    public int solution(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return -1;
    }

    public int solution2(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(i -> n % i == 1)
                .findFirst()
                .orElse(-1);
    }

}