class Solution {
    public int minCost(String cl, int[] nt) {
        int n=nt.length;
        int i=0;int s=0;
        while(i<n-1){
            char c=cl.charAt(i);
            /*if(colors.charAt(i)==colors.charAt(i+1)){
                if(nt[i]<nt[i+1]){
                    time+=nt[i];
                }
                else{
                    time+=nt[i+1];
                }
            }*/
            int j=i+1;int max=nt[i];
            while(j<n && c==cl.charAt(j)){
                if(nt[j]>max){
                    s=s+max;
                    max=nt[j];
                }
                else{
                    s=s+nt[j];
                }
                j++;
            }
            i=j;

        }
        return s;
    }
}