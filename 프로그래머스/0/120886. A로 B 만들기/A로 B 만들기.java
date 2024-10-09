import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Arrays.stream(before.split("")).sorted().forEach(sb1::append);
        Arrays.stream(after.split("")).sorted().forEach(sb2::append);
        if(sb1.toString().equals(sb2.toString())) {
            answer = 1;
        }
        return answer;
    }
}