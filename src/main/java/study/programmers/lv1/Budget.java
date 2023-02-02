package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class Budget {

    public static void main(String[] args) {
        Budget T = new Budget();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int budget = sc.nextInt();
        System.out.println(T.solution(d, budget));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }

}