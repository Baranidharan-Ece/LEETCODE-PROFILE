class Solution {
    public boolean isValid(String word) {
        if(word.length() <3) 
        return false;

        int digit=0;
        int vowel=0;
        int consonant=0;

        for(int i=0;i<word.length();i++) {
            char ch=Character.toLowerCase(word.charAt(i));

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u')
                vowel=1;
            else if(Character.isDigit(ch)) {
                digit=1;
            }
            else if(ch-'a'<26 && ch-'a'>=0) {
                consonant=1;
            }
            else
                return false;
        }

        if(consonant==1 && vowel==1) return true;
        else
            return false;
    }
}