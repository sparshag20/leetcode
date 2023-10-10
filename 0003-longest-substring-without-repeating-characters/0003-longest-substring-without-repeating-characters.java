class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        StringBuilder sb=new StringBuilder();
        int start=0;int end=0;
        for(int i=0;i<n;i++){
            int ind=sb.indexOf(""+s.charAt(i));
            if(ind!=-1){
                max=Math.max(max,sb.length());
                sb=new StringBuilder(sb.substring(ind+1,sb.length()));
            }
            sb.append(s.charAt(i));
        }
        return Math.max(max,sb.length());
    }
}