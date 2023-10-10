class Solution {
    public int partitionString(String s) {
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(hs.contains(s.charAt(i))){
                hs.clear();
                count++;
            }
            hs.add(s.charAt(i));
        }
        return count+1;
    }
}