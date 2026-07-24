class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        if (k==1) 
        return 0;
        Arrays.sort(nums);

        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            min_diff = Math.min(min_diff, diff);
        }

        return min_diff;
    }
}