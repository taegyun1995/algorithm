package study.inflearn.Array;

import java.util.Scanner;

public class _04피보나치수열 {

    public static void main(String[] args) {
        _04피보나치수열 t = new _04피보나치수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : t.solution(n)) {
            System.out.print(x + " ");
        }
    }

    // 다이나믹 프로그래밍 -> 입력 값에 따라 계산 시간이 선형적으로 증가, 시간 복잡도 = O(n)
    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr;
    }

}