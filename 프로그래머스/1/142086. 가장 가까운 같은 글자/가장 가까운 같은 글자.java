import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0,i);
            if (str.indexOf(s.charAt(i)) == -1) {
                list.add(-1);
            }else{
                list.add(i-str.lastIndexOf(s.charAt(i)));
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}