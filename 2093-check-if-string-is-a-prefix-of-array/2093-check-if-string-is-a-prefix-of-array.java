class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String m="";
        for(int i=0;i<words.length;i++){
            m+=words[i];
            if(s.equals(m)){
                return true;
            }
        }
        return false;
    }
}