class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb=new StringBuilder(ransomNote);
        if(ransomNote.equals("")){
            return true;
        }
        for(char c:magazine.toCharArray()){
            int ind=sb.indexOf(""+c);
            if(ind!=-1){
                sb.deleteCharAt(ind);
            }
            if(sb.isEmpty()){
                return true;   
            }
        }
        return false;
    }
}