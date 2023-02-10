package study.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DivisibleArrayOfNumbers {

    public static void main(String[] args) {
        DivisibleArrayOfNumbers t = new DivisibleArrayOfNumbers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int divisor = sc.nextInt();
        System.out.println(t.solution(arr, divisor));
    }

    public ArrayList<Integer> solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> answer = new ArrayList<>();
        for (int x : arr) {
            if (x % divisor == 0) {
                answer.add(x);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        java.util.Arrays.sort(answer);
        return answer;
    }

}