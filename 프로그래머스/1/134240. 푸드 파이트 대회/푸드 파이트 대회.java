import java.util.Arrays;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        food = Arrays.stream(food).map(i -> i/2).toArray();
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i]));
        }
        sb.append("0");
        for (int i =  food.length-1; i > 0; i--) {
            sb.append(String.valueOf(i).repeat(food[i]));
        }
        answer = sb.toString();
        return answer;
    }
}