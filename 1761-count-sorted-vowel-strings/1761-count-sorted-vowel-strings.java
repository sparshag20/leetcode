class Solution {
    public int count=0;
    public int countVowelStrings(int n) {
        char c[]={'a','e','i','o','u'};
        StringBuilder sb=new StringBuilder();
        countV(c,0,sb,n);
        return count;
    }
    public void countV(char[] c,int ind,StringBuilder sb,int n){
        if(ind>=c.length){
            return;
        }
        if(sb.length()==n){
            count+=1;
            return;
        }
        sb.append(c[ind]);
        countV(c,ind,sb,n);
        sb.deleteCharAt(sb.length()-1);
        countV(c,ind+1,sb,n);
        return;
    }
}