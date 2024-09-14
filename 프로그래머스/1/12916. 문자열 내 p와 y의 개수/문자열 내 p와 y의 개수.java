class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int a = s.replace("P","").length();
        int b = s.replace("Y","").length();
        if(a==b){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}