import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i == 0) list.add(i);
            if (i == 1) list.add(i);
            if (i >= 2) {
                Integer sum = (list.get(i - 2) + list.get(i - 1))%1234567;
                list.add(sum);
            }
        }
        answer = list.get(n);
        return answer;
    }
}