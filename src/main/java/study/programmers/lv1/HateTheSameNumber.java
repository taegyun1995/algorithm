package study.programmers.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class HateTheSameNumber {

    public static void main(String[] args) {
        HateTheSameNumber T = new HateTheSameNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));

    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}