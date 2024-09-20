import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0,i);
            StringBuffer sb = new StringBuffer();
            sb.append(str);
            sb.reverse();
            str = sb.toString();
            if(str.indexOf(s.substring(i,i+1)) != -1){
                list.add(str.indexOf(s.substring(i,i+1))+1);
            }else{
                list.add(str.indexOf(s.substring(i,i+1)));
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}