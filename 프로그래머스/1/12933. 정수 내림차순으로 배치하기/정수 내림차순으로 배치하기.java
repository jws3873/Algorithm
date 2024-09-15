class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuffer sb = new StringBuffer();
        String[] strArr = String.valueOf(n).split("");
        for(int i = 0; i< strArr.length; i++){
            for(int j = i+1; j <strArr.length;j++){
                int a = Integer.parseInt(strArr[i]);
                int b = Integer.parseInt(strArr[j]);
                if(a < b){
                    String c = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = c;
                }
            }
            sb.append(strArr[i]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}