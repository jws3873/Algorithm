class Solution {
    public int solution(int num) {
        int answer = 0;
        long lNum = num;
        while (lNum != 1) {
            answer +=1;
            if(lNum % 2 == 0){
                lNum = lNum / 2;
            }
            else{
                lNum = lNum * 3 + 1;
            }
            if(answer == 500 && lNum != 1){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}