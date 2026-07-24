class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        int n=words.length;
        List<String> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=0;
            String word=words[i].toLowerCase();
            char cha=word.charAt(0);
            if(row1.indexOf(cha)!=-1)
                c=1;
            else if(row2.indexOf(cha)!=-1)
                c=2;
            else
                c=3;
            int c0=0;
            for(int j=1;j<word.length();j++){
                char ch=word.charAt(j);
                if(c==1){
                    if(row1.indexOf(ch)==-1){
                        c0=1;
                        break;
                    }
                }
                else if(c==2){
                    if(row2.indexOf(ch)==-1){
                        c0=1;
                        break;
                    }
                }
                else{
                    if(row3.indexOf(ch)==-1){
                        c0=1;
                        break;
                    }
                }
            }
            if(c0==0)
                ls.add(words[i]);
        }
        String st[]=new String[ls.size()];
        for(int i=0;i<ls.size();i++){
            st[i]=ls.get(i);
        }
        return st;
    }
}