package study.programmers.lv1;

import java.util.Scanner;

public class MinimalRectangle {

    public static void main(String[] args) {
        MinimalRectangle t = new MinimalRectangle();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sizes = new int[n][n];
        for (int i = 0; i < n; i++) {
            sizes[i][i] = sc.nextInt();
        }
        System.out.println(t.solution(sizes));
    }

    public int solution(int[][] sizes) {
//        int answer = 0;
//        int max_v = 0;
//        int max_h = 0;
//        for (int i = 0; i < sizes.length; i++) {
//            int v = Math.max(sizes[i][0], sizes[i][1]);
//            int h = Math.min(sizes[i][0], sizes[i][1]);
//            max_v = Math.max(max_v, v);
//            max_h = Math.max(max_h, h);
//        }
//        answer = max_v * max_h;
//
//        return answer;

        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }

}