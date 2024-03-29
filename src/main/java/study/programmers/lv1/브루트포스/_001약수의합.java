package study.programmers.lv1.브루트포스;

import java.util.stream.IntStream;

public class _001약수의합 {

    public static void main(String[] args) {
        _001약수의합 t = new _001약수의합();
        int n = 12;
        int n2 = 5;
        System.out.println(t.solution(n));
        System.out.print(t.solution2(n2));
    }

    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum + n;
    }

    public int solution2(int n) {
        int sum = IntStream.rangeClosed(1, n / 2)
                .filter(i -> n % i == 0)
                .sum();

        return sum + n;
    }

}