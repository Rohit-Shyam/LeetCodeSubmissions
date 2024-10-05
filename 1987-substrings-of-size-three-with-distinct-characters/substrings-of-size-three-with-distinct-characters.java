class Solution {
    public static boolean reply(String s, int sl){
        HashSet<Character> hs = new HashSet<>();
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            hs.add(ch);
        }
        if(hs.size()==sl){
            return true;
        }else{
            return false;
        }
    }
        
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int sl = 3;
        int ans = 0;
        for(int i =0; i<n-(sl-1);i++){
            boolean temp = reply(s.substring(i,i+sl), sl);
            if(temp == true){
                ans++;
            }
        }
        return ans;
    }
}