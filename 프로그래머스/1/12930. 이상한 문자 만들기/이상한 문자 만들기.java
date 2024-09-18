class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        String[] strArr = s.split("");
        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if(cnt%2 == 0){
                strArr[i] = strArr[i].toUpperCase();
            }
            cnt = !strArr[i].equals(" ") ? cnt+1 : 0;
            sb.append(strArr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}