class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int temp = 0;
        int ans = 0;
        int cntT = 0;
        int cntF = 0;
        int l = 0;
        for(int r = 0; r<answerKey.length();r++){
            if(answerKey.charAt(r)=='T'){
                cntT+=1;
            }else{
                cntF+=1;
            }

            while(Math.min(cntT,cntF)>k){
                if(answerKey.charAt(l)=='T'){
                    cntT-=1;
                }else{
                    cntF-=1;
                }
                l++;
            }

            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}