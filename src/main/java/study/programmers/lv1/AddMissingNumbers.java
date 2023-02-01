package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class AddMissingNumbers {

    public int solution(int n, int[] numbers) {
        int result = 45;

        int sum = Arrays.stream(numbers).sum();
        result = result - sum;

        return result;
    }

    public static void main(String[] args) {
        AddMissingNumbers T = new AddMissingNumbers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, numbers));
    }


}
