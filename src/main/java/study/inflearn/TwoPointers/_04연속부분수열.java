package study.inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04연속부분수열 {

    public static void main(String[] args) {
        _04연속부분수열 t = new _04연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

}