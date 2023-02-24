package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _02APlusBMinus3 {

    public static void main(String[] args) {
        _02APlusBMinus3 t = new _02APlusBMinus3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for (Integer x : t.solution(arr1, arr2)) {
            System.out.println(x);
        }
    }

    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            answer.add(arr1[i] + arr2[i]);
        }

        return answer;
    }

}