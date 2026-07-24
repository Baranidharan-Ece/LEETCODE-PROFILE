class Solution {
    int ans = 0;
    public int numSquarefulPerms(int[] nums) {
    Arrays.sort(nums);
        solve(nums, new boolean[nums.length], new ArrayList());
        return ans;
    }

void solve(int[] nums, boolean v[], List<Integer> temp) {
    if(temp.size() == nums.length) {
           //List<Integer > list=()
             ans++;
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && !v[i - 1]) continue;
            if(v[i]) continue;
            if(temp.size() > 0) {
                int sum = temp.get(temp.size() - 1) + nums[i];
                if(!ps(sum)) {
                    continue;
                }
            }
            v[i] = true;
            temp.add(nums[i]);
            solve(nums, v, temp);
            v[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    

        
    boolean ps(int sum) {
        int sqrt = (int) Math.sqrt(sum);
        return sum - (sqrt*sqrt) == 0;
    }      
 }