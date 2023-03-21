package study.inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _01두배열합치기 {

    public static void main(String[] args) {
        _01두배열합치기 t = new _01두배열합치기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (Integer x : t.solution2(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int x : arr1) {
            answer.add(x);
        }
        for (int x : arr2) {
            answer.add(x);
        }
        Collections.sort(answer);

        return answer;
    }

    public ArrayList<Integer> solution2(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(arr1[p1++]);
        }
        while (p2 < m) {
            answer.add(arr2[p2++]);
        }

        return answer;
    }

}