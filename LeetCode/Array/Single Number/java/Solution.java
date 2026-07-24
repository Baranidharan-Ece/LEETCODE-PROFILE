class Solution {
    public int singleNumber(int[] nums) {
        int a=0;

        for(int s:nums){
            a=a^s;
        }
        return a;
    }
}