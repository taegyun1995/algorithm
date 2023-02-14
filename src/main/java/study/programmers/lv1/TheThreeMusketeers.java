package study.programmers.lv1;

import java.util.Scanner;

public class TheThreeMusketeers {

    public static void main(String[] args) {
        TheThreeMusketeers t = new TheThreeMusketeers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println(t.solution(number));
    }

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j <= number.length; j++) {
                for (int k = j+1; k <= number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

}