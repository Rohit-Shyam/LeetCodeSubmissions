class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            ans.add(nums[i]);
        }
        for(int i =0; i<nums.length;i++){
            ans.add(nums[i]);
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}