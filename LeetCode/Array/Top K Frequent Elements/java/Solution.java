class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        Map<Integer , Integer>map=new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int i=0; i<k;i++){
            int max=Integer.MIN_VALUE;
            int key=0;
            for(Map.Entry<Integer, Integer> entry:map.entrySet()){
                if(entry.getValue() > max){
                    max=entry.getValue();
                    key=entry.getKey();
                }
            }
            arr[i]=key;
            map.put(key,-1);
        }
    return arr;
    }
}