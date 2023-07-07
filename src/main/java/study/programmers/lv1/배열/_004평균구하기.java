package study.programmers.lv1.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _004평균구하기 {

    public static void main(String[] args) throws IOException {
        _004평균구하기 t = new _004평균구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] inputArr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println(t.solution(arr));
    }

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    public double solution2(int[] arr) {
        double result = 0;

        for (int x : arr) {
            result += x;
        }
        result = result / arr.length;

        return result;
    }

}