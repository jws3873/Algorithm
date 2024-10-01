class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        String[] words = s.split(" ", -1);  // -1을 주어 공백까지 유지하며 split

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { // 단어가 비어있지 않으면 처리
                sb.append(Character.toUpperCase(words[i].charAt(0))); // 첫 글자 대문자
                sb.append(words[i].substring(1)); // 나머지 부분 소문자 그대로 추가
            }

            if (i < words.length - 1) { // 마지막 단어가 아니면 공백 추가
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}