import java.util.List;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        List<String> list = List.of(phone_number.split(""));
        StringBuffer sb = new StringBuffer();
        int length = phone_number.length();
        for (int i = 0; i < list.size(); i++) {
            if(i < length - 4){
                sb.append("*");
            }else{
                sb.append(list.get(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}