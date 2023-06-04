class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;int max=0;
        for(Character c:s.toCharArray()){
            if(c=='0' && count>0){
                st=new Stack<>();
                count=0;
            }
            if(c=='0'){
                st.push(c);
            }
            if(c=='1' && !st.isEmpty()){
                st.pop();
                count+=2;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}