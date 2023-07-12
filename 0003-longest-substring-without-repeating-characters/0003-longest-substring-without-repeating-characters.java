class Solution {
    public int lengthOfLongestSubstring(String s) {
        String k="";
        int n=s.length();int max=0;int j=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(k.contains(""+c)){
                max=Math.max(max,k.length());
                k=k+c;
                k=k.substring(k.indexOf(c)+1,k.length());
                
            }
            else{
                k=k+c;
            }
        }
        return Math.max(max,k.length());
    }
}