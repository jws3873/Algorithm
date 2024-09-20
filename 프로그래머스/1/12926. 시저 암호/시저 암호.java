class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        char[] charArray = s.toCharArray(); //65~90, 97~122
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(charArray[i])){
                if(charArray[i]+n>'Z'){
                    sb.append(Character.toString((charArray[i]-90+64+n)));
                }else{
                    sb.append(Character.toString((charArray[i]+n)));
                }
            }else if(Character.isLowerCase(charArray[i])){
                if(charArray[i]+n>'z'){
                    sb.append(Character.toString((charArray[i]-122+96+n)));
                }else{
                    sb.append(Character.toString((charArray[i]+n)));
                }
            }else{
                sb.append(Character.toString(charArray[i]));
            }
        }
        answer = sb.toString();
        return answer;
    }
}