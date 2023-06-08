class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        StringBuilder sb=new StringBuilder(s);
        for(char c:t.toCharArray()){
            if(c==sb.charAt(0)){
                sb.deleteCharAt(0);
            }
            if(sb.isEmpty()){
                return true;
            }
        }
        return false;
    }
}