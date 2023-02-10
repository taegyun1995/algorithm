package study.programmers.lv1;

import java.util.Scanner;

public class EliminateTheSmallestNumber {

    public static void main(String[] args) {
        EliminateTheSmallestNumber t = new EliminateTheSmallestNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(arr));
    }

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        for (int i = minIndex + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

}