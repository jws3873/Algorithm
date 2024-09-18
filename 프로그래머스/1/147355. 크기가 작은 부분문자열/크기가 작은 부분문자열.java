class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp = "";
        for (int i = 0; i < t.length(); i++){
            tmp = t.substring(i);
            if(tmp.length() >= p.length()){
                tmp = tmp.substring(0, p.length());
                if(Long.parseLong(tmp) <= Long.parseLong(p)){
                    answer += 1;
                }
            }else{
                break;
            }
        }
        return answer;
    }
}