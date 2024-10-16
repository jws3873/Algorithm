import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,Integer> map = new HashMap<>();
        AtomicInteger index = new AtomicInteger(0);
        Arrays.stream(phone_book).forEach(s -> map.put(s,index.getAndIncrement()));
        for (int i = 0; i < phone_book.length; i++) {
            int length = phone_book[i].length();
            for (int j = 0; j < length; j++) {
                if (map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}