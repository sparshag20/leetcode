class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str="";
        String str1="";
        for(int i=0;i<word1.length;i++){
            str=str+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            str1=str1+word2[i];
        }
        return str.equals(str1)?true:false;
    }
}