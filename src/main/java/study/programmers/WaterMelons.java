package study.programmers;

import java.util.Scanner;

public class WaterMelons {

    public String solution(int n) {
//        String answer = "";
//        String su = "수";
//        String bak = "박";
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                answer += su;
//            }
//            if (i % 2 == 0) {
//                answer += bak;
//            }
//        }
//
//        return answer;

//        String result = "";
//        for (int i = 0; i < n; i++)
//            result += i % 2 == 0 ? "수" : "박";
//        return result;

        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    public static void main(String[] args) {
        WaterMelons T = new WaterMelons();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }

}
