package study.baekjoon.lv4;

import java.util.Arrays;
import java.util.Scanner;

public class _01개수세기 {

    public static void main(String[] args) {
        _01개수세기 t = new _01개수세기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        System.out.println(t.solution(arr, v));
    }

    public int solution(int[] arr, int v) {
        int cnt = (int) Arrays.stream(arr).filter(a -> a == v).count();
        return cnt;
    }

}