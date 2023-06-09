class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t=(int)target;
        for(char c:letters){
            int k=(int)c;
            if(k>t){
                return c;
            }
        }
        return letters[0];
    }
}