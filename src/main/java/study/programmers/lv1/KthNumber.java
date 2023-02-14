package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class KthNumber {

    public static void main(String[] args) {
        KthNumber t = new KthNumber();
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for (String s1 : s) {
            Integer.parseInt(s1);
        }

    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }

}