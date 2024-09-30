import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return answer;
    }
}