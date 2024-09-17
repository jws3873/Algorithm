import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        d = Arrays.stream(d).sorted().toArray();
        for (int i = 0; i < d.length; i++) {
            if(d[i] <= budget && budget != 0){
                budget -= d[i];
                answer +=1;
            }
        }
        return answer;
    }
}