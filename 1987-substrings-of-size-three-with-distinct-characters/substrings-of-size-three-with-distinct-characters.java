class Solution {
    public int countGoodSubstrings(String s) {
        HashMap <Character, Integer> hm = new HashMap<>();
        int l = 0;
        int ans = 0;
        int sl = 3;
        for(int r =0; r<s.length(); r++){
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            if(r-l==sl){
                char tch = s.charAt(l);
                hm.put(tch, hm.get(tch)-1);
                if(hm.get(tch)==0){
                    hm.remove(tch);
                }
                l++;
            }
            if(hm.size()==sl){
                ans++;
            }
        }
        return ans;
    }
}