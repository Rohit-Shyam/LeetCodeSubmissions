class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l =0;
        int min = Integer.MAX_VALUE;
        for(int r = 0 ; r<nums.length; r++){
            int temp = 0;
            if(r-l+1==k){
                temp = nums[r] - nums[l];
                min = Math.min(min,temp);
                l++;
            }
        }
        return min;
    }
}