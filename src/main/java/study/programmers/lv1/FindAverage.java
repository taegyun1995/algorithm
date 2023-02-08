package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {
        FindAverage t = new FindAverage();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(arr));
    }

    public double solution(int[] arr) {
//        double result = 0;
//        for (int x : arr) {
//            result += x;
//        }
//        result = result / arr.length;
//        return result;

        return Arrays.stream(arr).average().getAsDouble();
    }

}