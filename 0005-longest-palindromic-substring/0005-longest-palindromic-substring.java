class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
       if(n==0){
           return "";
       }
       int start=0;int end=0;
       for(int i=0;i<n;i++){
           int l1=maxPal(s,i,i);
           int l2=maxPal(s,i,i+1);
           int max=Math.max(l1,l2);
           if(max>end-start){
               start=i-((max-1)/2);
               end=i+(max/2);
           }
       }
       return s.substring(start,end+1);
    }
    public int maxPal(String s,int l,int r){
        if(s==null || l>r){
            return 0;
        }
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}