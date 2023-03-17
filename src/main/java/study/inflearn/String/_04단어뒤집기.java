package study.inflearn.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04단어뒤집기 {

    public static void main(String[] args) {
        _04단어뒤집기 t = new _04단어뒤집기();
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
        ArrayList<String> answer = Arrays.stream(str)
                                        .map(x -> new StringBuilder(x).reverse().toString())
                                        .collect(Collectors.toCollection(ArrayList::new));
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