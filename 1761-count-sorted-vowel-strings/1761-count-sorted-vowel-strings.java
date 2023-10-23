class Solution {
    int count=0;
    public int countVowelStrings(int n) {
        char c[]={'a','e','i','o','u'};
        StringBuilder sb=new StringBuilder();
        return countV(c,0,count,sb,n);
        //return count;
    }
    public int countV(char[] c,int ind,int count,StringBuilder sb,int n){
        if(ind>=c.length){
            return 0;
        }
        if(sb.length()==n){
            count++;
            return count;
        }
        sb.append(c[ind]);
        int a=countV(c,ind,count,sb,n);
        sb.deleteCharAt(sb.length()-1);
        int b=countV(c,ind+1,count,sb,n);
        return a+b;
    }
}