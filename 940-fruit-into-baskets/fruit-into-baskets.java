class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int l = 0;
        for(int r = 0; r<fruits.length; r++){
            hm.put(fruits[r], hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l], hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);  
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}