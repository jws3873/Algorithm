class Solution {
    public int[] solution(String s) {
        int length = 0;
        int[] answer = new int[2];
        answer[1] = 0;
        int i = 0;
        do {
            answer[1] += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            i+=1;
        } while (!s.equals("1"));
        answer[0] = i;
        return answer;
    }
}