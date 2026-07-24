class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int l=0;
        int r=0;
        int d=0;
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='L') l++;
            else if(m.charAt(i)=='R') r++;
            else d++;
        }
        return l>r?l+d-r:r+d-l;
    }
}