class Solution {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int temp = 0;
        int ans = 0;
        int l = 0;
        for(int r = 0; r<nums.length; r++){
            if(nums[r]==0){
                temp+=1;
            }
            while(temp>k){
                if(nums[l]==0){
                    temp-=1;
                }
                l++;
            }
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}