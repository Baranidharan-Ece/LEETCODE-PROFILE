import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        // 'right' acts as the right boundary of our sliding window
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we find a duplicate, shrink the window from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character and update the max length
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}