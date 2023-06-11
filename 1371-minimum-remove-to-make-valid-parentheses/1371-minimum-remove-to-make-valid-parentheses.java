class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        Stack<String> sm=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    continue;
                }
                else{
                    st.pop();
                    
                }
            }
            sb.append(s.charAt(i));
        }
        int j=sb.length()-1;
        while(!st.isEmpty()){
            if(sb.charAt(j)=='('){
                sb.deleteCharAt(j);
                st.pop();
            }
            j--;

        }
        return sb.toString();    }
}