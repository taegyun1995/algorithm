package study.baekjoon.lv3;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _06빠른APlusB {

    public static void main(String[] args) throws IOException {
        _06빠른APlusB t = new _06빠른APlusB();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");

            int a = Integer.parseInt(str.substring(0, target));
            int b = Integer.parseInt(str.substring(target + 1));

            sb.append(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }

    public ArrayList<Integer> solution(int[] a, int[] b) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            answer.add(a[i] + b[i]);
//        }

        ArrayList<Integer> answer = IntStream.range(0, a.length).mapToObj(i -> a[i] + b[i]).collect(Collectors.toCollection(ArrayList::new));

        return answer;
    }

}