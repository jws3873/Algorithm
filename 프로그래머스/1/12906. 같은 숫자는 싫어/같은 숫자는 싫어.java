import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int a = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                list.add(arr[i]);
                a = arr[i];
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}