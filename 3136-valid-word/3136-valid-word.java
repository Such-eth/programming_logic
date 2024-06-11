class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
            return false;
        int vovelCount=0,consonentCount=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!(ch>='0' && ch<='9' || ch>='a'&&ch<='z' || ch>='A'&&ch<='z'))
                return false;
            else{
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vovelCount++;
                else if(!(ch>='0' && ch<='9')) consonentCount++;
            }
        }
        return vovelCount>0&&consonentCount>0;
    }
}