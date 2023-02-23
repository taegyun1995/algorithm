package study.inflearn.Array;

import java.util.Scanner;

public class _05에라토스테네스체 {

    public static void main(String[] args) {
        _05에라토스테네스체 T = new _05에라토스테네스체();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int tmp = 0;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                tmp++;
            }
        }

        return tmp;
    }

    public int solution2(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

}
