class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs=new HashSet<>();
        int count=1;
        for(char c:s.toCharArray()){
            if(hs.contains(c)){
                count++;
                hs.clear();
            }
            hs.add(c);
        }
        return count;
    }
}