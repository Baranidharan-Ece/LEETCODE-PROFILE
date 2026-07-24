class Solution {
  public int semiOrderedPermutation(int[] nums) {
    int n = nums.length, a = 0, b = 0;
    
    for (int i=0; i<n; i++) {
      if (nums[i] == 1) 
      a = i;
      if (nums[i] == n) 
        b = i;
         }
         int res=a + (n-1-b) - (a > b ? 1 : 0);
    return res;
  }
}