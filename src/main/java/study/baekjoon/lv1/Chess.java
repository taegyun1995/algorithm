package study.baekjoon.lv1;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        Chess t = new Chess();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int[] arr) {
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] get = new int[arr.length];

        for (int i = 0; i < chess.length; i++) {
            get[i] = chess[i] - arr[i];
        }

        return get;
    }

}