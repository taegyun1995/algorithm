package study.programmers.lv1;

import java.util.Scanner;

public class _002약수의합 {

    public static void main(String[] args) {
        _002약수의합 t = new _002약수의합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

}