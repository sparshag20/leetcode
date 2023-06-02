class Solution {
    public boolean stoneGame(int[] piles) {
        int i=0;int j=piles.length-1;
        int a=0;int b=0;
        while(i<j){
            if(piles[i]>piles[j]){
                a+=piles[i++];
                b+=piles[j--];
            }
            else{
                a+=piles[j--];
                b+=piles[i++];
            }
        }
        return a>b?true:false;

    }
}