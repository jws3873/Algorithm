import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        answer = list.stream().distinct().sorted().mapToInt(i -> i).toArray();
        return answer;
    }
}