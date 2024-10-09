import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = {"RT","CF","JM","AN"};
        Map<String, Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);

        for (int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split("");
            if(choices[i] < 4){
                map.put(split[0],map.get(split[0])+(4-choices[i]));
            } else if (choices[i] > 4) {
                map.put(split[1],map.get(split[1])+(choices[i]%4));
            }
        }

        for(int i = 0; i < arr.length; i++){
            String[] split = arr[i].split("");
            if(map.get(split[0]) > map.get(split[1])){
                sb.append(split[0]);
            } else if (map.get(split[0]) < map.get(split[1])) {
                sb.append(split[1]);
            }else{
                int compare = split[0].compareTo(split[1]);
                sb.append(compare < 0 ? split[0] : split[1]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}