class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String k="";
        for(int i=0;i<words.size();i++){
            k+=words.get(i).charAt(0);
        }
        if(s.equals(k)){
            return true;
        }
        return false;
    }
}