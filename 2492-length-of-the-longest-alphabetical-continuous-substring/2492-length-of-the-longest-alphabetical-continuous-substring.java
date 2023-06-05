class Solution {
    public int longestContinuousSubstring(String s) {
        int b='z'- s.charAt(0);
        int count=1;int max=-1;
        for(int i=1;i<s.length();i++){
            int a='z'-s.charAt(i);
            if(a==b-1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
            b=a;
        }
        return Math.max(max,count);

    }
}