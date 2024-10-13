import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        if ((int)nums.length/2 > map.size()) {
            answer = map.size();
        }else {
            answer = (int)nums.length/2;
        }
        return answer;
    }
}