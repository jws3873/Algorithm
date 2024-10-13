class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean b = true;
        if (n <= 1) {
            return answer;
        }
        for (int i = 2; i <= n; i++) {
            b = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if(b){
                answer++;
            }
        }
        return answer;
    }
}