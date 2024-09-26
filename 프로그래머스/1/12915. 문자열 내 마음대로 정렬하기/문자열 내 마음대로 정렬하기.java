import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(i, strings[i].substring(n, n+1));
        }

        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        for(int i = 0; i < collect.size(); i++) {
            answer[i] = strings[collect.get(i).getKey()];
        }

        return answer;
    }
}