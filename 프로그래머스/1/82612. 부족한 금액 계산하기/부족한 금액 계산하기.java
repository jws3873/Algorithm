class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long usageFee = 0;
        for(int i = 1; i<= count; i++){
            usageFee += (long)price*i;
        }
        if(money - usageFee < 0){
            answer = Math.abs(money - usageFee);
        }else{
            answer = 0;
        }
        return answer;
    }
}