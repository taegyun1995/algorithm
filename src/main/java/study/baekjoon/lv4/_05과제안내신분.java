package study.baekjoon.lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05과제안내신분 {

    public static void main(String[] args) {
        _05과제안내신분 t = new _05과제안내신분();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        for (int i = 0; i < 28; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(arr)) {
            System.out.println(x);
        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1; i <= 28; i++) {
            if (arr[i] != i) {

            }
        }


        return answer;
    }

}