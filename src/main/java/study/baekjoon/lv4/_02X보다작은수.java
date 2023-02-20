package study.baekjoon.lv4;

import java.util.Arrays;
import java.util.Scanner;

public class _02X보다작은수 {

    public static void main(String[] args) {
        _02X보다작은수 t = new _02X보다작은수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(v, arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int x, int[] arr) {
        return Arrays.stream(arr).filter(a -> a < x).toArray();
    }

}
