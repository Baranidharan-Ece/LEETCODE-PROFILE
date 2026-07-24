class Solution {
    public int[] nextGreaterElements(int[] nums) {
int []arr=new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<2*nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]< nums[i%nums.length]){
                arr[stack.peek()] = nums[i%nums.length];
                stack.pop();
            
            }
stack.push(i%nums.length);
        }
return arr;        
    }
}