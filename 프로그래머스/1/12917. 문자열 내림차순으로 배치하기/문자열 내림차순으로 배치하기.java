import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        List<String> list = Arrays.asList(s.split(""));
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> sb.append(x));
        answer = sb.toString();
        return answer;
    }
}