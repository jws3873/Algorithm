import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        Arrays.stream(participant).forEach(s -> map.put(s,map.getOrDefault(s,0)+1));
        Arrays.stream(completion).forEach(s -> map.put(s,map.get(s)-1));
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if(stringIntegerEntry.getValue() > 0){
                sb.append(stringIntegerEntry.getKey());
            }
        }
        answer = sb.toString();
        return answer;
    }
}