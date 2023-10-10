class Solution {
    public int partitionString(String s) {
        int n=s.length();
        String k="";int count=0;
        for(int i=0;i<n;i++){
            if(!k.contains(""+s.charAt(i))){
                k+=s.charAt(i);
            }
            else{
                count++;
                k="";
                k+=s.charAt(i);
            }
        }
        return count+1;
    }
}