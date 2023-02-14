package study.programmers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PickTwoAndAddThem {

    public static void main(String[] args) {
        PickTwoAndAddThem t = new PickTwoAndAddThem();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(n, arr)) {
            System.out.println(x);
        }
    }

    public List<Integer> solution(int n, int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                answerList.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> collect = answerList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < collect.stream().count(); i++) {

        }

        return collect;
    }

}

