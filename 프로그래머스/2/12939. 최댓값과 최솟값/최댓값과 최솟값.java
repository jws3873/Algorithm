import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        String[] split = s.split(" ");
        int min = Arrays.stream(split).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(split).mapToInt(Integer::parseInt).max().getAsInt();
        sb.append(String.valueOf(min)+" "+String.valueOf(max));
        answer = sb.toString();
        return answer;
    }
}