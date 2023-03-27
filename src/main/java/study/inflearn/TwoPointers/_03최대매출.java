package study.inflearn.TwoPointers;

import java.util.Scanner;

public class _03최대매출 {

    public static void main(String[] args) {
        _03최대매출 t = new _03최대매출();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer;
        int min = 0;
        for (int i = 0; i < k; i++) {
            min += arr[i];
        }
        answer = min;

        for (int i = k; i < n; i++) {
            min += (arr[i] - arr[i - k]);
            answer = Math.max(answer, min);
        }

        return answer;
    }

}