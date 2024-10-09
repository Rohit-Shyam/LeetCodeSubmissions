class Solution {
    public int minimumCost(int[] cost) {
        int ans = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            ans += cost[i];
            if (i - 1 >= 0) {
                ans += cost[i - 1];
            }
        }
        return ans;
    }
}