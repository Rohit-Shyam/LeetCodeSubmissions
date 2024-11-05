class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int temp = 0;
        int ans = Integer.MAX_VALUE;
        for(int r = 0; r<nums.length; r++){
            temp = temp + nums[r];

            while(temp >= target){
                temp = temp - nums[l];
                ans = Math.min(ans, r-l+1);
                l++;
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}