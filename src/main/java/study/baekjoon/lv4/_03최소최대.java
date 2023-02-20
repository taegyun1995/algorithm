package study.baekjoon.lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03최소최대 {

    public static void main(String[] args) {
        _03최소최대 t = new _03최소최대();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(Arrays.stream(arr).min().getAsInt());
        answer.add(Arrays.stream(arr).max().getAsInt());
        return answer;
    }

}