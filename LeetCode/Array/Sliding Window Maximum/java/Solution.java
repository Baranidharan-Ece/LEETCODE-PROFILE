/*
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        int d = 0;
        for (int s = 0; s <= arr.length - k; s++) {
            int max = arr[s];
            for (int i = s; i < s + k; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            ans[d] = max;
            d++;
        }

        return ans;
    }
}
*/

import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int r = 0; 
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            
           
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            
            dq.offerLast(i);
            
            
            if (i >= k - 1) {
                ans[r++] = arr[dq.peekFirst()];
            }
        }
        
        return ans;
    }
}

