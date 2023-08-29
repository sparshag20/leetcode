class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder k=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                k.append(c);
            }
        }
        String j=k.toString();
        String m=k.reverse().toString();
        return true?m.equals(j):false;
    }
}