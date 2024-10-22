class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> hs = new HashSet<>();
        int temp = 0;
        int ans = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
            }else{
                while(hs.contains(s.charAt(r))){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}