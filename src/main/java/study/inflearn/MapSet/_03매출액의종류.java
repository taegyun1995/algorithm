package study.inflearn.MapSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class _03매출액의종류 {

    public static void main(String[] args) {
        _03매출액의종류 t = new _03매출액의종류();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer x : t.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt]) - 1);
            if (hm.get(arr[lt]) == 0) {
                hm.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }

    public ArrayList<Integer> solution2(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] count = new int[100001];
        int distinctCount = 0;

        for (int i = 0; i < k; i++) {
            if (count[arr[i]] == 0) {
                distinctCount++;
            }
            count[arr[i]]++;
        }

        answer.add(distinctCount);

        for (int i = k; i < n; i++) {
            count[arr[i - k]]--;
            if (count[arr[i - k]] == 0) {
                distinctCount--;
            }
            if (count[arr[i]] == 0) {
                distinctCount++;
            }
            count[arr[i]]++;
            answer.add(distinctCount);
        }

        return answer;
    }

    // 시간 복잡도 안좋음
    public ArrayList<Integer> solution3(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < k + i; j++) {
                set.add(arr[j]);
            }
            answer.add(set.size());
            set = new HashSet<>();
        }

        return answer;
    }

}