class Solution {
    public boolean rotateString(String s, String goal) {
        String result=" ";

        if(s.length() != goal.length()){
            return false;

        }

        for(int i=0;i<s.length();i++){
            result=s.substring(i)+s.substring(0,i);
            if(result.equals(goal)){
                return true;
            }
        }
        return false;
    }
}