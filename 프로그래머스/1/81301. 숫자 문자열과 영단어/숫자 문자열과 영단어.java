import java.util.Map;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<Integer,String> map = Map.of(
                0,	"zero",
                1,	"one",
                2,	"two",
                3,	"three",
                4,	"four",
                5,	"five",
                6,	"six",
                7,	"seven",
                8,	"eight",
                9,	"nine"
        );
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            s = s.replace(entry.getValue(), entry.getKey().toString());
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}