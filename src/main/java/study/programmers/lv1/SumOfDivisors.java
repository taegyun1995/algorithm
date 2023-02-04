package study.programmers.lv1;

import java.util.Scanner;

public class SumOfDivisors {

    public static void main(String[] args) {
        SumOfDivisors t = new SumOfDivisors();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

}