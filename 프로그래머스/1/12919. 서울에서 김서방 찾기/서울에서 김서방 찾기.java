import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int idx = Arrays.asList(seoul).indexOf("Kim");
        sb.append("김서방은 "+idx+"에 있다");
        answer = sb.toString();
        return answer;
    }
}