class Solution {
    public String getHint(String s, String g) {
        int bull=0;
        int cow=0;
        String k="";
        String m="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==g.charAt(i)){
                 bull++;
            }
            else{
                k=k+s.charAt(i);
                m=m+g.charAt(i);
            }
           /* else{
                if(ind!=-1){
                    cow++;
                    sb.deleteCharAt(ind);
                }
            }*/
        }
        StringBuilder sb=new StringBuilder(k);
         StringBuilder sb2=new StringBuilder(m);
        //System.out.println(sb2);
       // System.out.println(sb);
        for(int i=0;i<sb2.length();i++){
            int ind=sb.indexOf(""+sb2.charAt(i));
            if(ind!=-1){
                cow++;
                sb.deleteCharAt(ind);
            }
        }

        return bull+"A"+cow+"B";
    }
}