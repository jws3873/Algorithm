class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            // 해당 구간의 문자열을 뒤집기 위해 StringBuilder 사용
            StringBuilder sub = new StringBuilder(sb.substring(start, end + 1));
            sub.reverse();

            // 뒤집은 문자열을 원래 위치에 반영
            for (int j = 0; j < sub.length(); j++) {
                sb.setCharAt(start + j, sub.charAt(j));
            }
        }

        return sb.toString();
    }
}