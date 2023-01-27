package study.inf.Array;

import java.util.Scanner;

public class VisibleStudent {

    public int solution(int n, int[] arr) {
//        int count = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (max < arr[i]) {
//                count++;
//                max = arr[i];
//            }
//        }
//        return count;

        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }

}