import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(stack.isEmpty() || stack.peek() != i){
                stack.push(i);
            }
        }
        answer =  Arrays.stream(stack.toArray()).mapToInt(i -> (int) i).toArray();
        return answer;
    }
}