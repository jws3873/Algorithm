class Solution {
    public String solution(String s) {
        String answer = "";
        int i = (int)Math.round(s.length()/2);
        if(s.length()%2 == 0){
            answer = s.substring(i-1,i+1);
        }else{
            answer = s.substring(i,i+1);
        }
        return answer;
    }
}