class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String l="";
        for(int i=0;i<k;i++){
            l=l+str[i]+" ";
        }
        return l.trim();
    }
}