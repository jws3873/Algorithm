class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;
        if(a<b){
            int c = a;
            a = b;
            b = c;
        }
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        answer[0] = a;
        answer[1] = (n*m)/a;
        return answer;
    }
}