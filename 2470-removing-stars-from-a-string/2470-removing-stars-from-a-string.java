class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                s1.pop();
            }
            else{
                s1.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!s1.isEmpty()){
            sb.append(s1.peek());
            s1.pop();
        }
        return sb.reverse().toString();
    }
}