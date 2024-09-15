class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            a = Integer.parseInt(String.valueOf(str.charAt(i)));
            answer += a;
        }
        return answer;
    }
}