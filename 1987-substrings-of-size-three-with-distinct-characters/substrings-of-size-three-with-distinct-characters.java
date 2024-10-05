class Solution {
    public static boolean replyBack(String str) {
    for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                return false;  
            }
        }
    }
    return true;  
    }
    public int countGoodSubstrings(String s) {
        int sl = 3;
        int n = s.length();
        int ans = 0;
        for(int i =0; i<n; i++){
            int j = i+ (sl-1);
                if(j>=n){
                    break;
                }
                String temp = "";
                for(int k =i; k<=j;k++){
                    temp = temp + s.charAt(k);
                }
                if(replyBack(temp)){
                    ans++;
                }
        }
        return ans;
    }
}