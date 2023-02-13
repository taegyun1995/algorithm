package study.inflearn.Array;

import java.util.Scanner;

public class EratosthenesSieve {

    public static void main(String[] args) {
        EratosthenesSieve T = new EratosthenesSieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
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
