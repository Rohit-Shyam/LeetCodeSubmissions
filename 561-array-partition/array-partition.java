class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int l =0;
        int max = 0;
        int ans = 0;
        for(int r =0; r<nums.length; r++){
            if(r-l == 2){
                l=r;
                r++;
            }
            if(r-l+1 == 2){
                max = Math.min(nums[r],nums[l]);
                ans = ans + max;
            }
        }
        return ans;
    }
}