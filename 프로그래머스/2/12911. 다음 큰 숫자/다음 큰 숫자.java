class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = Integer.toBinaryString(n).replace("0", "").length();
        while (true) {
            int after = ++n;
            int afterLength = Integer.toBinaryString(after).replace("0", "").length();
            if(length == afterLength){
                answer = after;
                break;
            }
        }
        return answer;
    }
}