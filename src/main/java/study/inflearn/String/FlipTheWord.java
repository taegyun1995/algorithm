package study.inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipTheWord {

    public static void main(String[] args) {
        FlipTheWord t = new FlipTheWord();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : t.solution(n, str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

//    public String[] solution(int n, String[] str) {
//        String[] answer = new String[n];
//        for (int i = 0; i < str.length; i++) {
//            StringBuffer sb = new StringBuffer(str[i]);
//            answer[i] = sb.reverse().toString();
//        }
//        return answer;
//    }

//    public ArrayList<String> solution(int n, String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            char[] s = x.toCharArray();
//            int lt = 0;
//            int rt = x.length() - 1;
//            while (lt < rt) {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//            String tmp = String.valueOf(s);
//            answer.add(tmp);
//        }
//        return answer;
//    }

}