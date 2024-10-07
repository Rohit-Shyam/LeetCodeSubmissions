class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l =0;
        int min = Integer.MAX_VALUE;
        for(int r = 0 ; r<nums.length; r++){
            int val1 = nums[l];
            int val2 = nums[r];
            int temp = 0;
            if(r-l+1==k){
                temp = val2 - val1;
                min = Math.min(min,temp);
                l++;
            }

            
        }
        return min;
    }
}