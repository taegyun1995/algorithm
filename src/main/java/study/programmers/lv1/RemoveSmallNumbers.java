package study.programmers.lv1;

import java.util.Arrays;

public class RemoveSmallNumbers {

//    public int[] solution(int[] arr) {
//        if(arr.length == 1) {
//            arr[0] = -1;
//            return arr;
//        }
//        int[] copyArr = arr.clone();
//        Arrays.sort(copyArr);
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < copyArr.length; i++){
//            if(arr[i] != copyArr[0])
//                list.add(arr[i]);
//        }
//
//        int[] answer = new int[list.size()];
//        for(int i = 0; i < list.size(); i++){
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }

    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }


}
