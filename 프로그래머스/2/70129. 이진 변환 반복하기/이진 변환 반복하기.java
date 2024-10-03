class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int i = 0;
        do {
            answer[1] += s.length();
            s = s.replace("0", "");
            answer[1] -= s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;

        } while (!s.equals("1"));
        return answer;
    }
}