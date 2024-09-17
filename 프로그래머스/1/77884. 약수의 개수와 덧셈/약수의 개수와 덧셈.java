class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i<= right; i++){
            int limit = (int) Math.sqrt(i); // 제곱근을 구함
            int count = 0;
            for (int j = 1; j <= limit; j++) {
                if (i%j == 0) {
                    // j는 n의 약수
                    count +=1;

                    // i을 j로 나눈 몫도 약수 (단, 중복 확인을 피하기 위해 j와 몫이 같지 않을때)
                    int quotient = i / j;
                    if (j != quotient) {
                        count +=1;
                    }
                }
            }
            if(count % 2 == 0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }
}