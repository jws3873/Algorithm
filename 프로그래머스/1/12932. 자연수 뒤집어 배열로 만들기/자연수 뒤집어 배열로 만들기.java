class Solution {
    public int[] solution(long n) {
        String[] tmpArr = String.valueOf(n).split("");
        int[] answer = new int[tmpArr.length];
        for (int i =0; i< tmpArr.length; i++){
            answer[i] = Integer.parseInt(tmpArr[tmpArr.length-1-i]);
        }
        return answer;
    }
}
